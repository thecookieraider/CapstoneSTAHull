/**
 * ComponentKeys: An enum to translate between the string name of each component
 * and the number given to the component using .setName().
 * Anything beginning with LR corresponds to the loss reduction form, while the 
 * others correspond to the Inspection Report.
 * @author Lucas Hall
 * @author Zachary Zoltek
 * @version Apr 26, 2016
 */

package capstonelh;

public enum ComponentKeys{
    
    
    //Basic Information
    BUSINESS_NAME(0),
    PHONE(1),
    ADDRESS(2),
    //Emergency Contact
    NAME(10),
    CONTACT(11),
    TOP(12),
    OCCUPANCY_CLASS(13),
    HAZARD(14),
    FIREALARM(15),
    PANEL_PAD_LOCATION(16),
    NUMBER(17),
    PFA(18),
    DISTRICT(19),
    ACTIVE(20),
    SYSNORMAL(21),
    //SFLRTType
    OCCUPANCY(30),
    LIFE_SAFETY(31),
    SPRINKLER(32),
    COMPLAINT(33),
    EXPLOSIVE_STORAGE(34),
    HAZARDOUS_MATERIALS_PERMIT(35),
    UST(36),
    POST_INCIDENT(37),
    OPEN_BURNING(38),
    OTHER(39),
    SEMI_ANNUAL(40),
    ANNUAL(41),
    //LRMisc
    CLASS(51),
    BOX(52),
    LR_PFA(53),
    KNOX_BOX(54),
    LOCATION(55),
    //LR Emergency Contact
    LR_PHONE1(60),
    LR_PHONE2(61),
    LR_PHONE3(62),
    LR_PHONE4(63),
    LR_NAME1(64),
    LR_NAME2(65),
    LR_NAME3(66),
    LR_NAME4(67),
    //LR Notes
    LR_NOTES_COMMENTAREA(70),
    LR_NOTES_DATEFIELD(71),
    LR_NOTES_INSPECTORFIELD(72),
    LR_NOTES_SIGNATUREFIELD(73),
    LR_NOTES_YESBUTTON(74),
    LR_NOTE_NOBUTTON(75),
    //LR Business
    LR_BUSINESS_NAME(80),
    LR_BUSINESS_ADDRESS(81),
    LR_BUSINESS_SUITE(82),
    LR_BUSINESS_TELEPHONE(83),
    LR_BUSINESS_CITY(84),
    LR_BUSINESS_STATE(85),
    LR_BUSINESS_ZIP(86),
    LR_BUSINESS_OWNER_NAME(87),
    LR_BUSINESS_OWNER_ADDRESS(88),
    LR_BUSINESS_OWNER_SUITE(89),
    LR_BUSINESS_OWNER_TELEPHONE(90),
    LR_BUSINESS_OWNER_CITY(91),
    LR_BUSINESS_OWNER_STATE(92),
    LR_BUSINESS_OWNER_ZIP(93),
    //Field One
    OBSTRUCTION(100),
    HARDWARE(101),
    //Field Two
    EXIT_SIGNS_ILLUMINATED(110),
    EMERGENCY_LIGHTS_WORKING(111),
    //Field Three
    MAINTAINED_CLOSE_FULLY(120),
    UNAPPROVED_OPEN_DEVICES(121),
    CLEAR_OF_OBSTRUCTIONS(122),
    //Field Four
    MINIMUM_2A10BC(130),
    MAX_OF_75(131),
    ANNUAL_INSPECTION(132),
    FIRE_EXTINGUISHER_ACCESS(133),
    //Field Five
    EXTENSIONS_CORDS(140),
    MULTI_PLUG_ADAPTERS(141),
    OPEN_BOXES_SWITCHES(142),
    OPENINGS_IN_ELECTRICAL(143),
    CLEARANCE_FROM_STORAGE(144),
    //Field Six
    HOUSEKEEPING(150),
    BELOW_CEILING(151),
    BELOW_SPRINKLERS(152),
    UNDER_STAIRS(153),
    CLOSE_TO_IGNITION(154),
    //Field Seven
    FLAMMABLE_PLACARDS(160),
    MSDS_ON_PREMISES(161),
    NONSMOKING_SIGNS(162),
    //Field Eight
    SECURED(170),
    //Field Nine
    MINIMUM_4A40BC_FIRE(180),
    APPROVED_SPRAY_BOOTH(181),
    AUTO_EXTINGUISHING_SYSTEM(182),
    WELDING_HOTWORK_WARNING(183),
    //Field Ten
    ANNUAL_SERVICE(190),
    DATE_OF_LAST_SERVICE(191),
    SPRINKLER_STANDPIPE_ACCESS(192),
    STANDPIPE_STICKER(193),
    SPRINKLER_ROOM_IDENTIFIED(194),
    RISER_LOCATION(195),
    //Field Eleven
    SERVICE_WITHIN_6_MONTHS(200),
    LAST_SERVICE_DATE(201),
    ACCESS_TO_REMOTE(202),
    CLEAN(203),
    K_CLASS_EXTINGUISHER(204),
    NOZZLE_CONDITION(205),
    FILTERS_IN_PLACE(206),
    //Field Twelve
    POSTED_IN_PLACES(210),
    //Field Thirteen
    VISIBLE_AND_LEGIBLE(220),
    //Field Fourteen
    MAINT_LUBRICATION(230),
    KNOX_BOX_KEYS(231),
    KNOX_BOX_LOCATION(232),
    //Field Fifteen
    FDC_CAPS_IN_PLACE(240),
    FDC_IDENTIFIED(241),
    FDC_ACCESS_IS_UNOBSTRUCTED(242),
    //Field Sixteen
    OVERRIDE_KEYS_ON_SITE(250),
    //Field Seventeen
    PROPANE_PLACARDS(260),
    PERMIT_ON_SITE(261),
    IMPACT_BOLLARDS(262),
    //Field Eighteen
    OTHER_VIOLATIONS_NOTED(270);
    
    
    private final int value;
    
    ComponentKeys(int valueToSet){
        value = valueToSet;
    }
    
    public int getValue(){
        return value;
    }
}