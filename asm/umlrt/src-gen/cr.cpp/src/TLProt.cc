
#include "TLProt.hh"

#include "umlrtinsignal.hh"
#include "umlrtobjectclass.hh"
#include "umlrtoutsignal.hh"
#include "umlrtsignalregistry.hh"
struct UMLRTCommsPort;

static UMLRTObject_field fields_turnOff[] = 
{
    #ifdef NEED_NON_FLEXIBLE_ARRAY
    {
        0,
        0,
        0,
        0,
        0
    }
    #endif
};

static UMLRTObject payload_turnOff = 
{
    0,
    #ifdef NEED_NON_FLEXIBLE_ARRAY
    1
    #else
    0
    #endif
    ,
    fields_turnOff
};

static UMLRTObject_field fields_turnOn[] = 
{
    #ifdef NEED_NON_FLEXIBLE_ARRAY
    {
        0,
        0,
        0,
        0,
        0
    }
    #endif
};

static UMLRTObject payload_turnOn = 
{
    0,
    #ifdef NEED_NON_FLEXIBLE_ARRAY
    1
    #else
    0
    #endif
    ,
    fields_turnOn
};

TLProt::Base::Base( const UMLRTCommsPort * & srcPort )
: UMLRTProtocol( srcPort )
{
    UMLRTSignalRegistry & signalRegistry = UMLRTSignalRegistry::getRegistry();
    signalRegistry.registerInSignal( "TLProt", "turnOff", signal_turnOff, &payload_turnOff );
    signalRegistry.registerInSignal( "TLProt", "turnOn", signal_turnOn, &payload_turnOn );
}

UMLRTInSignal TLProt::Base::turnOff() const
{
    UMLRTInSignal signal;
    signal.initialize( "turnOff", signal_turnOff, srcPort, &payload_turnOff );
    return signal;
}

UMLRTInSignal TLProt::Base::turnOn() const
{
    UMLRTInSignal signal;
    signal.initialize( "turnOn", signal_turnOn, srcPort, &payload_turnOn );
    return signal;
}

TLProt::Conj::Conj( const UMLRTCommsPort * & srcPort )
: UMLRTProtocol( srcPort )
{
    UMLRTSignalRegistry & signalRegistry = UMLRTSignalRegistry::getRegistry();
    signalRegistry.registerOutSignal( "TLProt", "turnOff", signal_turnOff, &payload_turnOff );
    signalRegistry.registerOutSignal( "TLProt", "turnOn", signal_turnOn, &payload_turnOn );
}

UMLRTOutSignal TLProt::Conj::turnOff() const
{
    UMLRTOutSignal signal;
    signal.initialize( "turnOff", signal_turnOff, srcPort, &payload_turnOff );
    return signal;
}

UMLRTOutSignal TLProt::Conj::turnOn() const
{
    UMLRTOutSignal signal;
    signal.initialize( "turnOn", signal_turnOn, srcPort, &payload_turnOn );
    return signal;
}


