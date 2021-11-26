
#ifndef CROSSROAD_HH
#define CROSSROAD_HH

#include "umlrtcapsule.hh"
#include "umlrtcapsuleclass.hh"
#include "umlrtmessage.hh"
struct UMLRTCapsulePart;
struct UMLRTCommsPort;
struct UMLRTSlot;

class Capsule_CrossRoad : public UMLRTCapsule
{
public:
    Capsule_CrossRoad( const UMLRTCapsuleClass * cd, UMLRTSlot * st, const UMLRTCommsPort * * border, const UMLRTCommsPort * * internal, bool isStat );
    enum PartId
    {
        part_controller1,
        part_controller2,
        part_leds1,
        part_leds2
    };
protected:
    const UMLRTCapsulePart * const controller1;
    const UMLRTCapsulePart * const controller2;
    const UMLRTCapsulePart * const leds1;
    const UMLRTCapsulePart * const leds2;
public:
    virtual void bindPort( bool isBorder, int portId, int index );
    virtual void unbindPort( bool isBorder, int portId, int index );
    virtual void initialize( const UMLRTMessage & msg );
    virtual void inject( const UMLRTMessage & msg );
};
extern const UMLRTCapsuleClass CrossRoad;

#endif

