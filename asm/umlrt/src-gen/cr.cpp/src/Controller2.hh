
#ifndef CONTROLLER2_HH
#define CONTROLLER2_HH

#include "TLProt.hh"
#include "umlrtcapsule.hh"
#include "umlrtcapsuleclass.hh"
#include "umlrtlogprotocol.hh"
#include "umlrtmessage.hh"
#include "umlrttimerprotocol.hh"
struct UMLRTCommsPort;
struct UMLRTSlot;

class Capsule_Controller2 : public UMLRTCapsule
{
public:
    Capsule_Controller2( const UMLRTCapsuleClass * cd, UMLRTSlot * st, const UMLRTCommsPort * * border, const UMLRTCommsPort * * internal, bool isStat );
    enum PortId
    {
        port_log,
        port_p,
        port_timer
    };
    virtual void inject( const UMLRTMessage & message );
    virtual void initialize( const UMLRTMessage & message );
    const char * getCurrentStateString() const;
private:
    enum State
    {
        Amber,
        Green,
        Red,
        SPECIAL_INTERNAL_STATE_TOP,
        SPECIAL_INTERNAL_STATE_UNVISITED
    };
    const char * stateNames[5];
    State currentState;
    void update_state( State newState );
    void entryaction_____Amber( const UMLRTMessage * msg );
    void entryaction_____Green( const UMLRTMessage * msg );
    void entryaction_____Red( const UMLRTMessage * msg );
    void transitionaction_____rhlPFfim( const UMLRTMessage * msg );
    void actionchain_____hUTXfGXt( const UMLRTMessage * msg );
    void actionchain_____lFoKmWRM( const UMLRTMessage * msg );
    void actionchain_____rhlPFfim( const UMLRTMessage * msg );
    void actionchain_____yUjVIuVx( const UMLRTMessage * msg );
    State state_____Amber( const UMLRTMessage * msg );
    State state_____Green( const UMLRTMessage * msg );
    State state_____Red( const UMLRTMessage * msg );
protected:
    UMLRTLogProtocol_baserole log;
    TLProt::Conj p;
public:
    enum BorderPortId
    {
        borderport_p,
        borderport_timer,
        borderport_log
    };
protected:
    UMLRTTimerProtocol_baserole timer;
public:
    enum PartId
    {
    };
    virtual void bindPort( bool isBorder, int portId, int index );
    virtual void unbindPort( bool isBorder, int portId, int index );
};
extern const UMLRTCapsuleClass Controller2;

#endif

