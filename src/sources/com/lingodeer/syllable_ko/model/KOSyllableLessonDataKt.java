package com.lingodeer.syllable_ko.model;

import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l1.n;
import oz.x;
import ub.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class KOSyllableLessonDataKt {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KOSyllableLessonType.values().length];
            try {
                iArr[KOSyllableLessonType.SYLLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KOSyllableLessonType.SOUND_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:135:0x0157 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[RETURN] */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v12 int, still in use, count: 1, list:
      (r0v12 int) from 0x0038: SWITCH (r0v12 int)
     case 80698815: goto B:14:0x0044
     case 80698816: goto B:10:0x003c
     default: goto B:50:0x008e A[RegionRef:SW:8] (LINE:57)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 int, still in use, count: 2, list:
      (r0v4 int) from 0x00a3: SWITCH (r0v4 int)
     case 74603: goto B:88:0x00f1
     case 74604: goto B:83:0x00e4
     case 74605: goto B:78:0x00d7
     case 74606: goto B:73:0x00ca
     case 74607: goto B:68:0x00bd
     default: goto B:58:0x00a6 A[RegionRef:SW:57] (LINE:164)
      (r0v4 int) from 0x00a6: SWITCH (r0v4 int)
     case 80698815: goto B:64:0x00b4
     case 80698816: goto B:60:0x00ab
     default: goto B:135:0x0157 A[RegionRef:SW:58] (LINE:167)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String getDescription(KOSyllableLesson kOSyllableLesson) {
        m.f(kOSyllableLesson, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[kOSyllableLesson.getType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String lessonID = kOSyllableLesson.getLessonID();
            switch (lessonID) {
                case "L1":
                    return "한국어[한구거]";
                case "L2":
                    return "앉아[안자]";
                case "L3":
                    return "좋아요[조아요]; 같이[가치]";
                case "L4":
                    return "많다[만타]";
                case "L5":
                    return "학교[학꾜]";
                case "L6":
                    return "백만[뱅만]";
                case "L7":
                    return "진리[질리]";
                default:
                    switch (lessonID) {
                        case 80698815:
                            if (lessonID.equals("Test1")) {
                                return "REVIEW";
                            }
                            return BuildConfig.VERSION_NAME;
                        case 80698816:
                            if (lessonID.equals("Test2")) {
                                return "REVIEW";
                            }
                            return BuildConfig.VERSION_NAME;
                        default:
                            return BuildConfig.VERSION_NAME;
                    }
            }
        }
        String lessonID2 = kOSyllableLesson.getLessonID();
        switch (lessonID2) {
            case "L1":
                return "ㅏ  ㅓ  ㅇ  ㅁ";
            case "L2":
                return "ㅗ  ㅜ  ㄴ";
            case "L3":
                return "ㅐ  ㅔ  ㄹ  ㅎ";
            case "L4":
                return "ㅑ  ㅕ  ㅛ  ㅠ  ㅒ  ㅖ";
            case "L5":
                return "ㅡ  ㅣ  ㅢ";
            case "L6":
                return "ㅘ  ㅙ  ㅚ";
            case "L7":
                return "ㅝ  ㅞ  ㅟ";
            case "L8":
                return "ㄱ ㅋ  ㄲ";
            case "L9":
                return "ㄷ  ㅌ  ㄸ";
            default:
                switch (lessonID2) {
                    case 74603:
                        if (lessonID2.equals("L10")) {
                            return "ㅂ  ㅍ  ㅃ";
                        }
                        return BuildConfig.VERSION_NAME;
                    case 74604:
                        if (lessonID2.equals("L11")) {
                            return "ㅈ  ㅊ  ㅉ";
                        }
                        return BuildConfig.VERSION_NAME;
                    case 74605:
                        if (lessonID2.equals("L12")) {
                            return "ㅅ  ㅆ";
                        }
                        return BuildConfig.VERSION_NAME;
                    case 74606:
                        if (lessonID2.equals("L13")) {
                            return "받침: ㄴ  ㅁ  ㄹ  ㅇ";
                        }
                        return BuildConfig.VERSION_NAME;
                    case 74607:
                        if (lessonID2.equals("L14")) {
                            return "받침: ㄱ  ㄷ  ㅂ";
                        }
                        return BuildConfig.VERSION_NAME;
                    default:
                        switch (lessonID2) {
                            case 80698815:
                                if (lessonID2.equals("Test1")) {
                                    return "REVIEW";
                                }
                                return BuildConfig.VERSION_NAME;
                            case 80698816:
                                if (lessonID2.equals("Test2")) {
                                    return "REVIEW";
                                }
                                return BuildConfig.VERSION_NAME;
                            default:
                                return BuildConfig.VERSION_NAME;
                        }
                }
        }
    }

    public static final String getLessonName(KOSyllableLesson kOSyllableLesson, n nVar, int i11) {
        m.f(kOSyllableLesson, "<this>");
        return x.q0(a.e0(nVar, R.string.lesson_s), "%s", x.q0(kOSyllableLesson.getLessonID(), "L", BuildConfig.VERSION_NAME));
    }
}
