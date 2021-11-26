
#include "CrossRoad.hh"

#include "Controller1.hh"
#include "Controller2.hh"
#include "Led.hh"
#include "umlrtcapsuleclass.hh"
#include "umlrtcapsulepart.hh"
#include "umlrtcommsport.hh"
#include "umlrtframeservice.hh"
#include "umlrtslot.hh"
#include <cstddef>
#include "umlrtcapsulerole.hh"
class UMLRTRtsInterface;

Capsule_CrossRoad::Capsule_CrossRoad( const UMLRTCapsuleClass * cd, UMLRTSlot * st, const UMLRTCommsPort * * border, const UMLRTCommsPort * * internal, bool isStat )
: UMLRTCapsule( NULL, cd, st, border, internal, isStat )
, controller1( &slot->parts[part_controller1] )
, controller2( &slot->parts[part_controller2] )
, leds1( &slot->parts[part_leds1] )
, leds2( &slot->parts[part_leds2] )
{
}






void Capsule_CrossRoad::bindPort( bool isBorder, int portId, int index )
{
}

void Capsule_CrossRoad::unbindPort( bool isBorder, int portId, int index )
{
}

void Capsule_CrossRoad::initialize( const UMLRTMessage & msg )
{
}

void Capsule_CrossRoad::inject( const UMLRTMessage & msg )
{
}


static const UMLRTCapsuleRole roles[] = 
{
    {
        "controller1",
        &Controller1,
        1,
        1,
        false,
        false
    },
    {
        "controller2",
        &Controller2,
        1,
        1,
        false,
        false
    },
    {
        "leds1",
        &Led,
        3,
        3,
        false,
        false
    },
    {
        "leds2",
        &Led,
        3,
        3,
        false,
        false
    }
};

static void instantiate_CrossRoad( const UMLRTRtsInterface * rts, UMLRTSlot * slot, const UMLRTCommsPort * * borderPorts )
{
    UMLRTFrameService::connectPorts( &slot->parts[Capsule_CrossRoad::part_controller1].slots[0]->ports[Capsule_Controller1::borderport_p], 0, &slot->parts[Capsule_CrossRoad::part_leds1].slots[0]->ports[Capsule_Led::borderport_p], 0 );
    UMLRTFrameService::connectPorts( &slot->parts[Capsule_CrossRoad::part_controller1].slots[0]->ports[Capsule_Controller1::borderport_p], 1, &slot->parts[Capsule_CrossRoad::part_leds1].slots[1]->ports[Capsule_Led::borderport_p], 0 );
    UMLRTFrameService::connectPorts( &slot->parts[Capsule_CrossRoad::part_controller1].slots[0]->ports[Capsule_Controller1::borderport_p], 2, &slot->parts[Capsule_CrossRoad::part_leds1].slots[2]->ports[Capsule_Led::borderport_p], 0 );
    UMLRTFrameService::connectPorts( &slot->parts[Capsule_CrossRoad::part_controller2].slots[0]->ports[Capsule_Controller2::borderport_p], 0, &slot->parts[Capsule_CrossRoad::part_leds2].slots[0]->ports[Capsule_Led::borderport_p], 0 );
    UMLRTFrameService::connectPorts( &slot->parts[Capsule_CrossRoad::part_controller2].slots[0]->ports[Capsule_Controller2::borderport_p], 1, &slot->parts[Capsule_CrossRoad::part_leds2].slots[1]->ports[Capsule_Led::borderport_p], 0 );
    UMLRTFrameService::connectPorts( &slot->parts[Capsule_CrossRoad::part_controller2].slots[0]->ports[Capsule_Controller2::borderport_p], 2, &slot->parts[Capsule_CrossRoad::part_leds2].slots[2]->ports[Capsule_Led::borderport_p], 0 );
    Controller1.instantiate( NULL, slot->parts[Capsule_CrossRoad::part_controller1].slots[0], UMLRTFrameService::createBorderPorts( slot->parts[Capsule_CrossRoad::part_controller1].slots[0], Controller1.numPortRolesBorder ) );
    Controller2.instantiate( NULL, slot->parts[Capsule_CrossRoad::part_controller2].slots[0], UMLRTFrameService::createBorderPorts( slot->parts[Capsule_CrossRoad::part_controller2].slots[0], Controller2.numPortRolesBorder ) );
    Led.instantiate( NULL, slot->parts[Capsule_CrossRoad::part_leds1].slots[0], UMLRTFrameService::createBorderPorts( slot->parts[Capsule_CrossRoad::part_leds1].slots[0], Led.numPortRolesBorder ) );
    Led.instantiate( NULL, slot->parts[Capsule_CrossRoad::part_leds1].slots[1], UMLRTFrameService::createBorderPorts( slot->parts[Capsule_CrossRoad::part_leds1].slots[1], Led.numPortRolesBorder ) );
    Led.instantiate( NULL, slot->parts[Capsule_CrossRoad::part_leds1].slots[2], UMLRTFrameService::createBorderPorts( slot->parts[Capsule_CrossRoad::part_leds1].slots[2], Led.numPortRolesBorder ) );
    Led.instantiate( NULL, slot->parts[Capsule_CrossRoad::part_leds2].slots[0], UMLRTFrameService::createBorderPorts( slot->parts[Capsule_CrossRoad::part_leds2].slots[0], Led.numPortRolesBorder ) );
    Led.instantiate( NULL, slot->parts[Capsule_CrossRoad::part_leds2].slots[1], UMLRTFrameService::createBorderPorts( slot->parts[Capsule_CrossRoad::part_leds2].slots[1], Led.numPortRolesBorder ) );
    Led.instantiate( NULL, slot->parts[Capsule_CrossRoad::part_leds2].slots[2], UMLRTFrameService::createBorderPorts( slot->parts[Capsule_CrossRoad::part_leds2].slots[2], Led.numPortRolesBorder ) );
    slot->capsule = new Capsule_CrossRoad( &CrossRoad, slot, borderPorts, NULL, false );
}

const UMLRTCapsuleClass CrossRoad = 
{
    "CrossRoad",
    NULL,
    instantiate_CrossRoad,
    4,
    roles,
    0,
    NULL,
    0,
    NULL
};

