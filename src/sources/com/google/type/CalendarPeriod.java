package com.google.type;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum CalendarPeriod implements Internal.EnumLite {
    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);

    public static final int CALENDAR_PERIOD_UNSPECIFIED_VALUE = 0;
    public static final int DAY_VALUE = 1;
    public static final int FORTNIGHT_VALUE = 3;
    public static final int HALF_VALUE = 6;
    public static final int MONTH_VALUE = 4;
    public static final int QUARTER_VALUE = 5;
    public static final int WEEK_VALUE = 2;
    public static final int YEAR_VALUE = 7;
    private static final Internal.EnumLiteMap<CalendarPeriod> internalValueMap = new Internal.EnumLiteMap<CalendarPeriod>() { // from class: com.google.type.CalendarPeriod.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i11) {
            switch (i11) {
                case 0:
                    return CalendarPeriod.CALENDAR_PERIOD_UNSPECIFIED;
                case 1:
                    return CalendarPeriod.DAY;
                case 2:
                    return CalendarPeriod.WEEK;
                case 3:
                    return CalendarPeriod.FORTNIGHT;
                case 4:
                    return CalendarPeriod.MONTH;
                case 5:
                    return CalendarPeriod.QUARTER;
                case 6:
                    return CalendarPeriod.HALF;
                case 7:
                    return CalendarPeriod.YEAR;
                default:
                    CalendarPeriod calendarPeriod = CalendarPeriod.CALENDAR_PERIOD_UNSPECIFIED;
                    return null;
            }
        }
    };
    private final int value;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CalendarPeriodVerifier implements Internal.EnumVerifier {
        static {
            new CalendarPeriodVerifier();
        }

        private CalendarPeriodVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i11) {
            CalendarPeriod calendarPeriod;
            switch (i11) {
                case 0:
                    calendarPeriod = CalendarPeriod.CALENDAR_PERIOD_UNSPECIFIED;
                    break;
                case 1:
                    calendarPeriod = CalendarPeriod.DAY;
                    break;
                case 2:
                    calendarPeriod = CalendarPeriod.WEEK;
                    break;
                case 3:
                    calendarPeriod = CalendarPeriod.FORTNIGHT;
                    break;
                case 4:
                    calendarPeriod = CalendarPeriod.MONTH;
                    break;
                case 5:
                    calendarPeriod = CalendarPeriod.QUARTER;
                    break;
                case 6:
                    calendarPeriod = CalendarPeriod.HALF;
                    break;
                case 7:
                    calendarPeriod = CalendarPeriod.YEAR;
                    break;
                default:
                    CalendarPeriod calendarPeriod2 = CalendarPeriod.CALENDAR_PERIOD_UNSPECIFIED;
                    calendarPeriod = null;
                    break;
            }
            return calendarPeriod != null;
        }
    }

    CalendarPeriod(int i11) {
        this.value = i11;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
