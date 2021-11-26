
#include "Controller2.hh"

#include "umlrtcommsportrole.hh"
#include "umlrtmessage.hh"
#include "umlrtslot.hh"
#include "umlrttimerprotocol.hh"
#include <cstddef>
#include "umlrtcapsuleclass.hh"
class UMLRTRtsInterface;
struct UMLRTCommsPort;

Capsule_Controller2::Capsule_Controller2( const UMLRTCapsuleClass * cd, UMLRTSlot * st, const UMLRTCommsPort * * border, const UMLRTCommsPort * * internal, bool isStat )
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


void Capsule_Controller2::inject( const UMLRTMessage & message )
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

void Capsule_Controller2::initialize( const UMLRTMessage & message )
{
    msg = &message;
    actionchain_____rhlPFfim( &message );
    currentState = Green;
}

const char * Capsule_Controller2::getCurrentStateString() const
{
    return stateNames[currentState];
}




void Capsule_Controller2::update_state( Capsule_Controller2::State newState )
{
    currentState = newState;
}

void Capsule_Controller2::entryaction_____Amber( const UMLRTMessage * msg )
{
    #define rtdata ( (void *)msg->getParam( 0 ) )
    /* UMLRTGEN-USERREGION-BEGIN file:/tmp/ca.jahed.rtpoet.papyrusrt/uml/Crossroad.uml Crossroad::Controller2::Amber entry  */
    log.log("\tHT: Entering Amber state");
    timer.informIn(UMLRTTimespec(3, 0));

    /* UMLRTGEN-USERREGION-END */
    #undef rtdata
}

void Capsule_Controller2::entryaction_____Green( const UMLRTMessage * msg )
{
    #define rtdata ( (void *)msg->getParam( 0 ) )
    /* UMLRTGEN-USERREGION-BEGIN file:/tmp/ca.jahed.rtpoet.papyrusrt/uml/Crossroad.uml Crossroad::Controller2::Green entry  */
    log.log("\tHT: Entering Green state");
    timer.informIn(UMLRTTimespec(11, 0));

    /* UMLRTGEN-USERREGION-END */
    #undef rtdata
}

void Capsule_Controller2::entryaction_____Red( const UMLRTMessage * msg )
{
    #define rtdata ( (void *)msg->getParam( 0 ) )
    /* UMLRTGEN-USERREGION-BEGIN file:/tmp/ca.jahed.rtpoet.papyrusrt/uml/Crossroad.uml Crossroad::Controller2::Red entry  */
    log.log("\tHT: Entering Red state");
    timer.informIn(UMLRTTimespec(14, 0));

    /* UMLRTGEN-USERREGION-END */
    #undef rtdata
}

void Capsule_Controller2::transitionaction_____rhlPFfim( const UMLRTMessage * msg )
{
    #define rtdata ( (void *)msg->getParam( 0 ) )
    /* UMLRTGEN-USERREGION-BEGIN file:/tmp/ca.jahed.rtpoet.papyrusrt/uml/Crossroad.uml Crossroad::Controller2 transition Init,Green */
    p.turnOn().send();
    /* UMLRTGEN-USERREGION-END */
    #undef rtdata
}

void Capsule_Controller2::actionchain_____hUTXfGXt( const UMLRTMessage * msg )
{
    update_state( SPECIAL_INTERNAL_STATE_TOP );
    update_state( Red );
    entryaction_____Red( msg );
}

void Capsule_Controller2::actionchain_____lFoKmWRM( const UMLRTMessage * msg )
{
    update_state( SPECIAL_INTERNAL_STATE_TOP );
    update_state( Green );
    entryaction_____Green( msg );
}

void Capsule_Controller2::actionchain_____rhlPFfim( const UMLRTMessage * msg )
{
    transitionaction_____rhlPFfim( msg );
    update_state( Green );
    entryaction_____Green( msg );
}

void Capsule_Controller2::actionchain_____yUjVIuVx( const UMLRTMessage * msg )
{
    update_state( SPECIAL_INTERNAL_STATE_TOP );
    update_state( Amber );
    entryaction_____Amber( msg );
}

Capsule_Controller2::State Capsule_Controller2::state_____Amber( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_timer:
        switch( msg->getSignalId() )
        {
        case UMLRTTimerProtocol::signal_timeout:
            actionchain_____hUTXfGXt( msg );
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

Capsule_Controller2::State Capsule_Controller2::state_____Green( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_timer:
        switch( msg->getSignalId() )
        {
        case UMLRTTimerProtocol::signal_timeout:
            actionchain_____yUjVIuVx( msg );
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

Capsule_Controller2::State Capsule_Controller2::state_____Red( const UMLRTMessage * msg )
{
    switch( msg->destPort->role()->id )
    {
    case port_timer:
        switch( msg->getSignalId() )
        {
        case UMLRTTimerProtocol::signal_timeout:
            actionchain_____lFoKmWRM( msg );
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






void Capsule_Controller2::bindPort( bool isBorder, int portId, int index )
{
}

void Capsule_Controller2::unbindPort( bool isBorder, int portId, int index )
{
}


static const UMLRTCommsPortRole portroles_border[] = 
{
    {
        Capsule_Controller2::port_p,
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
        Capsule_Controller2::port_timer,
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
        Capsule_Controller2::port_log,
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

static void instantiate_Controller2( const UMLRTRtsInterface * rts, UMLRTSlot * slot, const UMLRTCommsPort * * borderPorts )
{
    slot->capsule = new Capsule_Controller2( &Controller2, slot, borderPorts, NULL, false );
}

const UMLRTCapsuleClass Controller2 = 
{
    "Controller2",
    NULL,
    instantiate_Controller2,
    0,
    NULL,
    3,
    portroles_border,
    0,
    NULL
};

