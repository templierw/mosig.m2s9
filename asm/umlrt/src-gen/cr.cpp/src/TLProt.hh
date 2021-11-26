
#ifndef TLPROT_HH
#define TLPROT_HH

#include "umlrtinsignal.hh"
#include "umlrtoutsignal.hh"
#include "umlrtprotocol.hh"
#include "umlrtsignal.hh"
struct UMLRTCommsPort;

namespace TLProt
{
    class Base : public UMLRTProtocol
    {
    public:
        Base( const UMLRTCommsPort * & srcPort );
        UMLRTInSignal turnOff() const;
        UMLRTInSignal turnOn() const;
    };
    enum SignalId
    {
        signal_turnOff = UMLRTSignal::FIRST_PROTOCOL_SIGNAL_ID,
        signal_turnOn
    };
    class Conj : public UMLRTProtocol
    {
    public:
        Conj( const UMLRTCommsPort * & srcPort );
        UMLRTOutSignal turnOff() const;
        UMLRTOutSignal turnOn() const;
    };
};

#endif

