
#include "Controller1.hh"

#include "umlrtcommsportrole.hh"
#include "umlrtmessage.hh"
#include "umlrtslot.hh"
#include "umlrttimerprotocol.hh"
#include <cstddef>
#include "umlrtcapsuleclass.hh"
class UMLRTRtsInterface;
struct UMLRTCommsPort;

Capsule_Controller1::Capsule_Controller1( const UMLRTCapsuleClass * cd, UMLRTSlot * st, const UMLRTCommsPort * * border, const UMLRTCommsPort * * internal, bool isStat )
: UMLRTCapsule( NULL, cd, st, border, internal, isStat )
, currentState( SPECIAL_INTERNAL_STATE_UNVISITED )
, p( borderPorts[borderport_p] )
, timer( borderPorts[borderport_timer] )
{
    stateNames[Amber] = "Amber";
    stateNames[Green] = "Green";
    stateNames[Red] = "Red";
    stateNames[SPECIAL_INTERNAL_STATE_TOP] = "<top>";
    stateNames[SPECIAL_INTERNAL_STATE_UNVISITED] = "<uninitialized>";
}


void Capsule_Controller1::inject( const UMLRTMessage & message )
{
    msg = &message;
    switch( currentState )
    {
    case Red:
        currentState = state_____Red( &message );
        break;
    case Green:
        currentState = state_____Green( &message );
        break;
    case Amber:
        currentState = state_____Amber( &message );
        break;
    default:
        break;
    }
}

void Capsule_Controller1::initialize( const UMLRTMessage & message )
{
    msg = &message;
    actionchain_____aFyLjRhK( &message );
    currentState = Red;
}

const char * Capsule_Controller1::getCurrentStateString() const
{
    return stateNames[currentState];
}




void Capsule_Controller1::update_state( Capsule_Controller1::State newState )
{
    currentState = newState;
}

void Capsule_Controller1::entryaction_____Amber( const UMLRTMessage * msg )
{
    #define rtdata ( (void *)msg->getParam( 0 ) )
    /* UMLRTGEN-USERREGION-BEGIN file:/tmp/ca.jahed.rtpoet.papyrusrt/uml/Crossroad.uml Crossroad::Controller1::Amber entry  */
    log.log("VT: Entering Amber state");
    timer.informIn(UMLRTTimespec(3, 0));

    /* UMLRTGEN-USERREGION-END */
    #undef rtdata
}

void Capsule_Controller1::entryaction_____Green( const UMLRTMessage * msg )
{
    #define rtdata ( (void *)msg->getParam( 0 ) )
    /* UMLRTGEN-USERREGION-BEGIN file:/tmp/ca.jahed.rtpoet.papyrusrt/uml/Crossroad.uml Crossroad::Controller1::Green entry  */
    log.log("VT: Entering Green state");
    timer.informIn(UMLRTTimespec(11, 0));

    /* UMLRTGEN-USERREGION-END */
    #undef rtdata
}

void Capsule_Controller1::entryaction_____Red( const UMLRTMessage * msg )
{
    #define rtdata ( (void *)msg->getParam( 0 ) )
    /* UMLRTGEN-USERREGION-BEGIN file:/tmp/ca.jahed.rtpoet.papyrusrt/uml/Crossroad.uml Crossroad::Controller1::Red entry  */
    log.log("VT: Entering Red state");
    timer.informIn(UMLRTTimespec(14, 0));

    /* UMLRTGEN-USERREGION-END */
    #undef rtdata
}

void Capsule_Controller1::transitionaction_____aFyLjRhK( const UMLRTMessage * msg )
{
    #define rtdata ( (void *)msg->getParam( 0 ) )
    /* UMLRTGEN-USERREGION-BEGIN file:/tmp/ca.jahed.rtpoet.papyrusrt/uml/Crossroad.uml Crossroad::Controller1 transition Init,Red */
    p.turnOn().send();
    /* UMLRTGEN-USERREGION-END */
    #undef rtdata
}

void Capsule_Controller1::actionchain_____UhqEDwBH( const UMLRTMessage * msg )
{
    update_state( SPECIAL_INTERNAL_STATE_TOP );
    update_state( Red );
    entryaction_____Red( msg );
}

void Capsule_Controller1::actionchain_____aFyLjRhK( const UMLRTMessage * msg )
{
    transitionaction_____aFyLjRhK( msg );
    update_state( Red );
    entryaction_____Red( msg );
}

void Capsule_Controller1::actionchain_____awkJwFSx( const UMLRTMessage * msg )
{
    update_state( SPECIAL_INTERNAL_STATE_TOP );
    update_state( Green );
    entryaction_____Green( msg );
}

void Capsule_Controller1::actionchain_____ueGOrbrr( const UMLRTMessage * msg )
{
    update_state( SPECIAL_INTERNAL_STATE_TOP );
    update_state( Amber );
    entryaction_____Amber( msg );
}

Capsule_Controller1::State Capsule_Controller1::state_____Amber( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_timer:
        switch( msg->getSignalId() )
        {
        case UMLRTTimerProtocol::signal_timeout:
            actionchain_____UhqEDwBH( msg );
            return Red;
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

Capsule_Controller1::State Capsule_Controller1::state_____Green( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_timer:
        switch( msg->getSignalId() )
        {
        case UMLRTTimerProtocol::signal_timeout:
            actionchain_____ueGOrbrr( msg );
            return Amber;
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

Capsule_Controller1::State Capsule_Controller1::state_____Red( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_timer:
        switch( msg->getSignalId() )
        {
        case UMLRTTimerProtocol::signal_timeout:
            actionchain_____awkJwFSx( msg );
            return Green;
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






void Capsule_Controller1::bindPort( bool isBorder, int portId, int index )
{
}

void Capsule_Controller1::unbindPort( bool isBorder, int portId, int index )
{
}


static const UMLRTCommsPortRole portroles_border[] = 
{
    {
        Capsule_Controller1::port_p,
        "TLProt",
        "p",
        "",
        3,
        true,
        true,
        false,
        false,
        false,
        false,
        false
    },
    {
        Capsule_Controller1::port_timer,
        "Timing",
        "timer",
        "",
        0,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    },
    {
        Capsule_Controller1::port_log,
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

static void instantiate_Controller1( const UMLRTRtsInterface * rts, UMLRTSlot * slot, const UMLRTCommsPort * * borderPorts )
{
    slot->capsule = new Capsule_Controller1( &Controller1, slot, borderPorts, NULL, false );
}

const UMLRTCapsuleClass Controller1 = 
{
    "Controller1",
    NULL,
    instantiate_Controller1,
    0,
    NULL,
    3,
    portroles_border,
    0,
    NULL
};

