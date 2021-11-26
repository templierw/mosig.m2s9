
#include "Led.hh"

#include "TLProt.hh"
#include "umlrtcommsportrole.hh"
#include "umlrtmessage.hh"
#include "umlrtslot.hh"
#include <cstddef>
#include "umlrtcapsuleclass.hh"
class UMLRTRtsInterface;
struct UMLRTCommsPort;

Capsule_Led::Capsule_Led( const UMLRTCapsuleClass * cd, UMLRTSlot * st, const UMLRTCommsPort * * border, const UMLRTCommsPort * * internal, bool isStat )
: UMLRTCapsule( NULL, cd, st, border, internal, isStat )
, currentState( SPECIAL_INTERNAL_STATE_UNVISITED )
, p( borderPorts[borderport_p] )
{
    stateNames[Off] = "Off";
    stateNames[On] = "On";
    stateNames[SPECIAL_INTERNAL_STATE_TOP] = "<top>";
    stateNames[SPECIAL_INTERNAL_STATE_UNVISITED] = "<uninitialized>";
}


void Capsule_Led::inject( const UMLRTMessage & message )
{
    msg = &message;
    switch( currentState )
    {
    case On:
        currentState = state_____On( &message );
        break;
    case Off:
        currentState = state_____Off( &message );
        break;
    default:
        break;
    }
}

void Capsule_Led::initialize( const UMLRTMessage & message )
{
    msg = &message;
    actionchain_____LSOMPSKq( &message );
    currentState = Off;
}

const char * Capsule_Led::getCurrentStateString() const
{
    return stateNames[currentState];
}




void Capsule_Led::update_state( Capsule_Led::State newState )
{
    currentState = newState;
}

void Capsule_Led::actionchain_____EyeQsVzB( const UMLRTMessage * msg )
{
    update_state( SPECIAL_INTERNAL_STATE_TOP );
    update_state( On );
}

void Capsule_Led::actionchain_____GsaIwiyS( const UMLRTMessage * msg )
{
    update_state( SPECIAL_INTERNAL_STATE_TOP );
    update_state( Off );
}

void Capsule_Led::actionchain_____LSOMPSKq( const UMLRTMessage * msg )
{
    update_state( Off );
}

Capsule_Led::State Capsule_Led::state_____Off( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_p:
        switch( msg->getSignalId() )
        {
        case TLProt::signal_turnOn:
            actionchain_____EyeQsVzB( msg );
            return On;
        default:
            this->unexpectedMessage();
            break;
        }
        return currentState;
    default:
        this->unexpectedMessage();
        break;
    }
    return currentState;
}

Capsule_Led::State Capsule_Led::state_____On( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_p:
        switch( msg->getSignalId() )
        {
        case TLProt::signal_turnOff:
            actionchain_____GsaIwiyS( msg );
            return Off;
        default:
            this->unexpectedMessage();
            break;
        }
        return currentState;
    default:
        this->unexpectedMessage();
        break;
    }
    return currentState;
}





void Capsule_Led::bindPort( bool isBorder, int portId, int index )
{
}

void Capsule_Led::unbindPort( bool isBorder, int portId, int index )
{
}


static const UMLRTCommsPortRole portroles_border[] = 
{
    {
        Capsule_Led::port_p,
        "TLProt",
        "p",
        "",
        1,
        true,
        false,
        false,
        false,
        false,
        false,
        false
    },
    {
        Capsule_Led::port_log,
        "Log",
        "log",
        "",
        0,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    }
};

static void instantiate_Led( const UMLRTRtsInterface * rts, UMLRTSlot * slot, const UMLRTCommsPort * * borderPorts )
{
    slot->capsule = new Capsule_Led( &Led, slot, borderPorts, NULL, false );
}

const UMLRTCapsuleClass Led = 
{
    "Led",
    NULL,
    instantiate_Led,
    0,
    NULL,
    2,
    portroles_border,
    0,
    NULL
};

