package com.google.type;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum DayOfWeek implements Internal.EnumLite {
    DAY_OF_WEEK_UNSPECIFIED(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    UNRECOGNIZED(-1);

    public static final int DAY_OF_WEEK_UNSPECIFIED_VALUE = 0;
    public static final int FRIDAY_VALUE = 5;
    public static final int MONDAY_VALUE = 1;
    public static final int SATURDAY_VALUE = 6;
    public static final int SUNDAY_VALUE = 7;
    public static final int THURSDAY_VALUE = 4;
    public static final int TUESDAY_VALUE = 2;
    public static final int WEDNESDAY_VALUE = 3;
    private static final Internal.EnumLiteMap<DayOfWeek> internalValueMap = new Internal.EnumLiteMap<DayOfWeek>() { // from class: com.google.type.DayOfWeek.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i11) {
            switch (i11) {
                case 0:
                    return DayOfWeek.DAY_OF_WEEK_UNSPECIFIED;
                case 1:
                    return DayOfWeek.MONDAY;
                case 2:
                    return DayOfWeek.TUESDAY;
                case 3:
                    return DayOfWeek.WEDNESDAY;
                case 4:
                    return DayOfWeek.THURSDAY;
                case 5:
                    return DayOfWeek.FRIDAY;
                case 6:
                    return DayOfWeek.SATURDAY;
                case 7:
                    return DayOfWeek.SUNDAY;
                default:
                    DayOfWeek dayOfWeek = DayOfWeek.DAY_OF_WEEK_UNSPECIFIED;
                    return null;
            }
        }
    };
    private final int value;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DayOfWeekVerifier implements Internal.EnumVerifier {
        static {
            new DayOfWeekVerifier();
        }

        private DayOfWeekVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i11) {
            DayOfWeek dayOfWeek;
            switch (i11) {
                case 0:
                    dayOfWeek = DayOfWeek.DAY_OF_WEEK_UNSPECIFIED;
                    break;
                case 1:
                    dayOfWeek = DayOfWeek.MONDAY;
                    break;
                case 2:
                    dayOfWeek = DayOfWeek.TUESDAY;
                    break;
                case 3:
                    dayOfWeek = DayOfWeek.WEDNESDAY;
                    break;
                case 4:
                    dayOfWeek = DayOfWeek.THURSDAY;
                    break;
                case 5:
                    dayOfWeek = DayOfWeek.FRIDAY;
                    break;
                case 6:
                    dayOfWeek = DayOfWeek.SATURDAY;
                    break;
                case 7:
                    dayOfWeek = DayOfWeek.SUNDAY;
                    break;
                default:
                    DayOfWeek dayOfWeek2 = DayOfWeek.DAY_OF_WEEK_UNSPECIFIED;
                    dayOfWeek = null;
                    break;
            }
            return dayOfWeek != null;
        }
    }

    DayOfWeek(int i11) {
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
