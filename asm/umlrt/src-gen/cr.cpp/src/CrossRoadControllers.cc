
#include "CrossRoadControllers.hh"

#include "Controller1.hh"
#include "Controller2.hh"
#include "CrossRoad.hh"
#include "Led.hh"
#include "umlrtcapsuleclass.hh"
#include "umlrtcapsulepart.hh"
#include "umlrtcommsport.hh"
#include "umlrtcommsportfarend.hh"
#include "umlrtcontroller.hh"
#include "umlrtslot.hh"
#include <cstddef>


static UMLRTController DefaultController_( "DefaultController" );

UMLRTController * DefaultController = &DefaultController_;

static Capsule_CrossRoad crossRoad( &CrossRoad, &CrossRoad_slots[InstId_CrossRoad], NULL, NULL, true );

static UMLRTSlot * slots_CrossRoad[] = 
{
    &CrossRoad_slots[InstId_CrossRoad_controller1],
    &CrossRoad_slots[InstId_CrossRoad_controller2],
    &CrossRoad_slots[InstId_CrossRoad_leds1_0],
    &CrossRoad_slots[InstId_CrossRoad_leds1_1],
    &CrossRoad_slots[InstId_CrossRoad_leds1_2],
    &CrossRoad_slots[InstId_CrossRoad_leds2_0],
    &CrossRoad_slots[InstId_CrossRoad_leds2_1],
    &CrossRoad_slots[InstId_CrossRoad_leds2_2]
};

static UMLRTCapsulePart parts_CrossRoad[] = 
{
    {
        &CrossRoad,
        Capsule_CrossRoad::part_controller1,
        1,
        &slots_CrossRoad[0]
    },
    {
        &CrossRoad,
        Capsule_CrossRoad::part_controller2,
        1,
        &slots_CrossRoad[1]
    },
    {
        &CrossRoad,
        Capsule_CrossRoad::part_leds1,
        3,
        &slots_CrossRoad[2]
    },
    {
        &CrossRoad,
        Capsule_CrossRoad::part_leds2,
        3,
        &slots_CrossRoad[5]
    }
};

static UMLRTCommsPortFarEnd borderfarEndList_CrossRoad_controller1[] = 
{
    {
        0,
        NULL
    },
    {
        0,
        &borderports_CrossRoad_leds1_0[Capsule_Led::borderport_p]
    },
    {
        0,
        &borderports_CrossRoad_leds1_1[Capsule_Led::borderport_p]
    },
    {
        0,
        &borderports_CrossRoad_leds1_2[Capsule_Led::borderport_p]
    },
    {
        0,
        NULL
    }
};

UMLRTCommsPort borderports_CrossRoad_controller1[] = 
{
    {
        &Controller1,
        Capsule_Controller1::borderport_p,
        &CrossRoad_slots[InstId_CrossRoad_controller1],
        3,
        &borderfarEndList_CrossRoad_controller1[1],
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    },
    {
        &Controller1,
        Capsule_Controller1::borderport_timer,
        &CrossRoad_slots[InstId_CrossRoad_controller1],
        1,
        &borderfarEndList_CrossRoad_controller1[4],
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    },
    {
        &Controller1,
        Capsule_Controller1::borderport_log,
        &CrossRoad_slots[InstId_CrossRoad_controller1],
        1,
        borderfarEndList_CrossRoad_controller1,
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    }
};

static const UMLRTCommsPort * borderports_CrossRoad_controller1_ptrs[] = 
{
    &borderports_CrossRoad_controller1[0],
    &borderports_CrossRoad_controller1[1],
    &borderports_CrossRoad_controller1[2]
};

static Capsule_Controller1 crossRoad_controller1( &Controller1, &CrossRoad_slots[InstId_CrossRoad_controller1], borderports_CrossRoad_controller1_ptrs, NULL, true );

static UMLRTCommsPortFarEnd borderfarEndList_CrossRoad_controller2[] = 
{
    {
        0,
        NULL
    },
    {
        0,
        &borderports_CrossRoad_leds2_0[Capsule_Led::borderport_p]
    },
    {
        0,
        &borderports_CrossRoad_leds2_1[Capsule_Led::borderport_p]
    },
    {
        0,
        &borderports_CrossRoad_leds2_2[Capsule_Led::borderport_p]
    },
    {
        0,
        NULL
    }
};

UMLRTCommsPort borderports_CrossRoad_controller2[] = 
{
    {
        &Controller2,
        Capsule_Controller2::borderport_p,
        &CrossRoad_slots[InstId_CrossRoad_controller2],
        3,
        &borderfarEndList_CrossRoad_controller2[1],
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    },
    {
        &Controller2,
        Capsule_Controller2::borderport_timer,
        &CrossRoad_slots[InstId_CrossRoad_controller2],
        1,
        &borderfarEndList_CrossRoad_controller2[4],
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    },
    {
        &Controller2,
        Capsule_Controller2::borderport_log,
        &CrossRoad_slots[InstId_CrossRoad_controller2],
        1,
        borderfarEndList_CrossRoad_controller2,
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    }
};

static const UMLRTCommsPort * borderports_CrossRoad_controller2_ptrs[] = 
{
    &borderports_CrossRoad_controller2[0],
    &borderports_CrossRoad_controller2[1],
    &borderports_CrossRoad_controller2[2]
};

static Capsule_Controller2 crossRoad_controller2( &Controller2, &CrossRoad_slots[InstId_CrossRoad_controller2], borderports_CrossRoad_controller2_ptrs, NULL, true );

static UMLRTCommsPortFarEnd borderfarEndList_CrossRoad_leds1_0[] = 
{
    {
        0,
        NULL
    },
    {
        0,
        &borderports_CrossRoad_controller1[Capsule_Controller1::borderport_p]
    }
};

UMLRTCommsPort borderports_CrossRoad_leds1_0[] = 
{
    {
        &Led,
        Capsule_Led::borderport_p,
        &CrossRoad_slots[InstId_CrossRoad_leds1_0],
        1,
        &borderfarEndList_CrossRoad_leds1_0[1],
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    },
    {
        &Led,
        Capsule_Led::borderport_log,
        &CrossRoad_slots[InstId_CrossRoad_leds1_0],
        1,
        borderfarEndList_CrossRoad_leds1_0,
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    }
};

static const UMLRTCommsPort * borderports_CrossRoad_leds1_0_ptrs[] = 
{
    &borderports_CrossRoad_leds1_0[0],
    &borderports_CrossRoad_leds1_0[1]
};

static Capsule_Led crossRoad_leds1_0( &Led, &CrossRoad_slots[InstId_CrossRoad_leds1_0], borderports_CrossRoad_leds1_0_ptrs, NULL, true );

static UMLRTCommsPortFarEnd borderfarEndList_CrossRoad_leds1_1[] = 
{
    {
        0,
        NULL
    },
    {
        1,
        &borderports_CrossRoad_controller1[Capsule_Controller1::borderport_p]
    }
};

UMLRTCommsPort borderports_CrossRoad_leds1_1[] = 
{
    {
        &Led,
        Capsule_Led::borderport_p,
        &CrossRoad_slots[InstId_CrossRoad_leds1_1],
        1,
        &borderfarEndList_CrossRoad_leds1_1[1],
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    },
    {
        &Led,
        Capsule_Led::borderport_log,
        &CrossRoad_slots[InstId_CrossRoad_leds1_1],
        1,
        borderfarEndList_CrossRoad_leds1_1,
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    }
};

static const UMLRTCommsPort * borderports_CrossRoad_leds1_1_ptrs[] = 
{
    &borderports_CrossRoad_leds1_1[0],
    &borderports_CrossRoad_leds1_1[1]
};

static Capsule_Led crossRoad_leds1_1( &Led, &CrossRoad_slots[InstId_CrossRoad_leds1_1], borderports_CrossRoad_leds1_1_ptrs, NULL, true );

static UMLRTCommsPortFarEnd borderfarEndList_CrossRoad_leds1_2[] = 
{
    {
        0,
        NULL
    },
    {
        2,
        &borderports_CrossRoad_controller1[Capsule_Controller1::borderport_p]
    }
};

UMLRTCommsPort borderports_CrossRoad_leds1_2[] = 
{
    {
        &Led,
        Capsule_Led::borderport_p,
        &CrossRoad_slots[InstId_CrossRoad_leds1_2],
        1,
        &borderfarEndList_CrossRoad_leds1_2[1],
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    },
    {
        &Led,
        Capsule_Led::borderport_log,
        &CrossRoad_slots[InstId_CrossRoad_leds1_2],
        1,
        borderfarEndList_CrossRoad_leds1_2,
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    }
};

static const UMLRTCommsPort * borderports_CrossRoad_leds1_2_ptrs[] = 
{
    &borderports_CrossRoad_leds1_2[0],
    &borderports_CrossRoad_leds1_2[1]
};

static Capsule_Led crossRoad_leds1_2( &Led, &CrossRoad_slots[InstId_CrossRoad_leds1_2], borderports_CrossRoad_leds1_2_ptrs, NULL, true );

static UMLRTCommsPortFarEnd borderfarEndList_CrossRoad_leds2_0[] = 
{
    {
        0,
        NULL
    },
    {
        0,
        &borderports_CrossRoad_controller2[Capsule_Controller2::borderport_p]
    }
};

UMLRTCommsPort borderports_CrossRoad_leds2_0[] = 
{
    {
        &Led,
        Capsule_Led::borderport_p,
        &CrossRoad_slots[InstId_CrossRoad_leds2_0],
        1,
        &borderfarEndList_CrossRoad_leds2_0[1],
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    },
    {
        &Led,
        Capsule_Led::borderport_log,
        &CrossRoad_slots[InstId_CrossRoad_leds2_0],
        1,
        borderfarEndList_CrossRoad_leds2_0,
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    }
};

static const UMLRTCommsPort * borderports_CrossRoad_leds2_0_ptrs[] = 
{
    &borderports_CrossRoad_leds2_0[0],
    &borderports_CrossRoad_leds2_0[1]
};

static Capsule_Led crossRoad_leds2_0( &Led, &CrossRoad_slots[InstId_CrossRoad_leds2_0], borderports_CrossRoad_leds2_0_ptrs, NULL, true );

static UMLRTCommsPortFarEnd borderfarEndList_CrossRoad_leds2_1[] = 
{
    {
        0,
        NULL
    },
    {
        1,
        &borderports_CrossRoad_controller2[Capsule_Controller2::borderport_p]
    }
};

UMLRTCommsPort borderports_CrossRoad_leds2_1[] = 
{
    {
        &Led,
        Capsule_Led::borderport_p,
        &CrossRoad_slots[InstId_CrossRoad_leds2_1],
        1,
        &borderfarEndList_CrossRoad_leds2_1[1],
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    },
    {
        &Led,
        Capsule_Led::borderport_log,
        &CrossRoad_slots[InstId_CrossRoad_leds2_1],
        1,
        borderfarEndList_CrossRoad_leds2_1,
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    }
};

static const UMLRTCommsPort * borderports_CrossRoad_leds2_1_ptrs[] = 
{
    &borderports_CrossRoad_leds2_1[0],
    &borderports_CrossRoad_leds2_1[1]
};

static Capsule_Led crossRoad_leds2_1( &Led, &CrossRoad_slots[InstId_CrossRoad_leds2_1], borderports_CrossRoad_leds2_1_ptrs, NULL, true );

static UMLRTCommsPortFarEnd borderfarEndList_CrossRoad_leds2_2[] = 
{
    {
        0,
        NULL
    },
    {
        2,
        &borderports_CrossRoad_controller2[Capsule_Controller2::borderport_p]
    }
};

UMLRTCommsPort borderports_CrossRoad_leds2_2[] = 
{
    {
        &Led,
        Capsule_Led::borderport_p,
        &CrossRoad_slots[InstId_CrossRoad_leds2_2],
        1,
        &borderfarEndList_CrossRoad_leds2_2[1],
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    },
    {
        &Led,
        Capsule_Led::borderport_log,
        &CrossRoad_slots[InstId_CrossRoad_leds2_2],
        1,
        borderfarEndList_CrossRoad_leds2_2,
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    }
};

static const UMLRTCommsPort * borderports_CrossRoad_leds2_2_ptrs[] = 
{
    &borderports_CrossRoad_leds2_2[0],
    &borderports_CrossRoad_leds2_2[1]
};

static Capsule_Led crossRoad_leds2_2( &Led, &CrossRoad_slots[InstId_CrossRoad_leds2_2], borderports_CrossRoad_leds2_2_ptrs, NULL, true );

UMLRTSlot CrossRoad_slots[] = 
{
    {
        "CrossRoad",
        0,
        &CrossRoad,
        NULL,
        0,
        &crossRoad,
        &DefaultController_,
        4,
        parts_CrossRoad,
        0,
        NULL,
        NULL,
        true,
        false
    },
    {
        "CrossRoad.controller1",
        0,
        &Controller1,
        &CrossRoad,
        Capsule_CrossRoad::part_controller1,
        &crossRoad_controller1,
        &DefaultController_,
        0,
        NULL,
        3,
        borderports_CrossRoad_controller1,
        NULL,
        true,
        false
    },
    {
        "CrossRoad.controller2",
        0,
        &Controller2,
        &CrossRoad,
        Capsule_CrossRoad::part_controller2,
        &crossRoad_controller2,
        &DefaultController_,
        0,
        NULL,
        3,
        borderports_CrossRoad_controller2,
        NULL,
        true,
        false
    },
    {
        "CrossRoad.leds1[0]",
        0,
        &Led,
        &CrossRoad,
        Capsule_CrossRoad::part_leds1,
        &crossRoad_leds1_0,
        &DefaultController_,
        0,
        NULL,
        2,
        borderports_CrossRoad_leds1_0,
        NULL,
        true,
        false
    },
    {
        "CrossRoad.leds1[1]",
        1,
        &Led,
        &CrossRoad,
        Capsule_CrossRoad::part_leds1,
        &crossRoad_leds1_1,
        &DefaultController_,
        0,
        NULL,
        2,
        borderports_CrossRoad_leds1_1,
        NULL,
        true,
        false
    },
    {
        "CrossRoad.leds1[2]",
        2,
        &Led,
        &CrossRoad,
        Capsule_CrossRoad::part_leds1,
        &crossRoad_leds1_2,
        &DefaultController_,
        0,
        NULL,
        2,
        borderports_CrossRoad_leds1_2,
        NULL,
        true,
        false
    },
    {
        "CrossRoad.leds2[0]",
        0,
        &Led,
        &CrossRoad,
        Capsule_CrossRoad::part_leds2,
        &crossRoad_leds2_0,
        &DefaultController_,
        0,
        NULL,
        2,
        borderports_CrossRoad_leds2_0,
        NULL,
        true,
        false
    },
    {
        "CrossRoad.leds2[1]",
        1,
        &Led,
        &CrossRoad,
        Capsule_CrossRoad::part_leds2,
        &crossRoad_leds2_1,
        &DefaultController_,
        0,
        NULL,
        2,
        borderports_CrossRoad_leds2_1,
        NULL,
        true,
        false
    },
    {
        "CrossRoad.leds2[2]",
        2,
        &Led,
        &CrossRoad,
        Capsule_CrossRoad::part_leds2,
        &crossRoad_leds2_2,
        &DefaultController_,
        0,
        NULL,
        2,
        borderports_CrossRoad_leds2_2,
        NULL,
        true,
        false
    }
};

