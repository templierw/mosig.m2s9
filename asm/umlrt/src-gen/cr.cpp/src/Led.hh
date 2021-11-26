
#ifndef LED_HH
#define LED_HH

#include "TLProt.hh"
#include "umlrtcapsule.hh"
#include "umlrtcapsuleclass.hh"
#include "umlrtlogprotocol.hh"
#include "umlrtmessage.hh"
struct UMLRTCommsPort;
struct UMLRTSlot;

class Capsule_Led : public UMLRTCapsule
{
public:
    Capsule_Led( const UMLRTCapsuleClass * cd, UMLRTSlot * st, const UMLRTCommsPort * * border, const UMLRTCommsPort * * internal, bool isStat );
    enum PortId
    {
        port_log,
        port_p
    };
    virtual void inject( const UMLRTMessage & message );
    virtual void initialize( const UMLRTMessage & message );
    const char * getCurrentStateString() const;
private:
    enum State
    {
        Off,
        On,
        SPECIAL_INTERNAL_STATE_TOP,
        SPECIAL_INTERNAL_STATE_UNVISITED
    };
    const char * stateNames[4];
    State currentState;
    void update_state( State newState );
    void actionchain_____EyeQsVzB( const UMLRTMessage * msg );
    void actionchain_____GsaIwiyS( const UMLRTMessage * msg );
    void actionchain_____LSOMPSKq( const UMLRTMessage * msg );
    State state_____Off( const UMLRTMessage * msg );
    State state_____On( const UMLRTMessage * msg );
protected:
    UMLRTLogProtocol_baserole log;
    TLProt::Base p;
public:
    enum BorderPortId
    {
        borderport_p,
        borderport_log
    };
    enum PartId
    {
    };
    virtual void bindPort( bool isBorder, int portId, int index );
    virtual void unbindPort( bool isBorder, int portId, int index );
};
extern const UMLRTCapsuleClass Led;

#endif

