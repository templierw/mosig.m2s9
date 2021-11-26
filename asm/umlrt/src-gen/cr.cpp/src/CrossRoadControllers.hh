
#ifndef CROSSROADCONTROLLERS_HH
#define CROSSROADCONTROLLERS_HH

class UMLRTController;
struct UMLRTCommsPort;
struct UMLRTSlot;

enum CapsuleInstanceId
{
    InstId_CrossRoad,
    InstId_CrossRoad_controller1,
    InstId_CrossRoad_controller2,
    InstId_CrossRoad_leds1_0,
    InstId_CrossRoad_leds1_1,
    InstId_CrossRoad_leds1_2,
    InstId_CrossRoad_leds2_0,
    InstId_CrossRoad_leds2_1,
    InstId_CrossRoad_leds2_2
};
extern UMLRTController * DefaultController;
extern UMLRTCommsPort borderports_CrossRoad_controller1[];
extern UMLRTCommsPort borderports_CrossRoad_controller2[];
extern UMLRTCommsPort borderports_CrossRoad_leds1_0[];
extern UMLRTCommsPort borderports_CrossRoad_leds1_1[];
extern UMLRTCommsPort borderports_CrossRoad_leds1_2[];
extern UMLRTCommsPort borderports_CrossRoad_leds2_0[];
extern UMLRTCommsPort borderports_CrossRoad_leds2_1[];
extern UMLRTCommsPort borderports_CrossRoad_leds2_2[];
extern UMLRTSlot CrossRoad_slots[];

#endif

