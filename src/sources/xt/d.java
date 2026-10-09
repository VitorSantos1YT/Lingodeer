package xt;

import aj.uZCn.evRpcb;
import am.rVFB.LwKl;
import android.net.Uri;
import b7.e0;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.DailyLearnHistory;
import com.lingodeer.data.model.DailyLearnWithLearnTimeHistory;
import com.lingodeer.data.model.characterstroke.CharacterStroke;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.o0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ko.Zea.ealNNtLp;
import oz.x;
import pt.ImS.aYZzTH;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f56292a = {0, 1, 2, 3, 4, 5, 6, 8, 7, 11, 12, 13, 14, 15, 16, 17, 10, 22, 20, 40, 47, 48, 53, 54, 51, 55, 57, 21, 61, 65, 63, 18, 19, 69};

    public static final void A(CourseUnit courseUnit, List allUnits, g gVar, fz.c cVar) {
        kotlin.jvm.internal.m.f(allUnits, "allUnits");
        ArrayList arrayList = new ArrayList();
        Iterator it = allUnits.iterator();
        while (it.hasNext()) {
            CourseUnit courseUnit2 = (CourseUnit) it.next();
            if (!x.s0(courseUnit2.getUnitName(), "TESTOUT", false)) {
                arrayList.add(Long.valueOf(courseUnit2.getUnitId()));
            }
        }
        Long[] lArr = (Long[]) arrayList.toArray(new Long[0]);
        CourseUnit courseUnit3 = null;
        Object obj = null;
        if (courseUnit.getSortIndex() < lArr.length) {
            for (Object obj2 : allUnits) {
                if (((CourseUnit) obj2).getUnitId() == lArr[courseUnit.getSortIndex()].longValue()) {
                    obj = obj2;
                    break;
                }
            }
            courseUnit3 = (CourseUnit) obj;
        }
        int sortIndex = courseUnit.getSortIndex();
        HashMap map = gVar.f56294a;
        if (sortIndex >= lArr.length || courseUnit3 == null) {
            return;
        }
        long jLongValue = lArr[sortIndex].longValue();
        if (x.s0(courseUnit3.getUnitName(), "TESTOUT", false)) {
            int i11 = sortIndex + 1;
            if (i11 >= lArr.length) {
                return;
            } else {
                jLongValue = lArr[i11].longValue();
            }
        }
        if (map.containsKey(Long.valueOf(jLongValue))) {
            return;
        }
        map.put(Long.valueOf(jLongValue), 1);
        cVar.invoke(lArr[sortIndex]);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    public static final CourseCharacter B(CharacterStroke characterStroke) {
        String tranSPN;
        String zhuyin;
        kotlin.jvm.internal.m.f(characterStroke, "<this>");
        int i11 = ((o0) b.c()).f27733a.locateLanguage;
        if (i11 == 47) {
            tranSPN = characterStroke.getTranSPN();
        } else if (i11 == 51) {
            tranSPN = characterStroke.getTranARA();
        } else if (i11 == 57) {
            tranSPN = characterStroke.getTranTHAI();
        } else if (i11 != 61) {
            switch (i11) {
                case 0:
                    tranSPN = characterStroke.getTranCHN();
                    break;
                case 1:
                    tranSPN = characterStroke.getTranJPN();
                    break;
                case 2:
                    tranSPN = characterStroke.getTranKRN();
                    break;
                case 3:
                    tranSPN = characterStroke.getTranENG();
                    break;
                case 4:
                    tranSPN = characterStroke.getTranSPN();
                    break;
                case 5:
                    tranSPN = characterStroke.getTranFRN();
                    break;
                case 6:
                    tranSPN = characterStroke.getTranDEN();
                    break;
                case 7:
                    tranSPN = characterStroke.getTranVTN();
                    break;
                case 8:
                    tranSPN = characterStroke.getTranPTG();
                    break;
                default:
                    switch (i11) {
                        case 10:
                            tranSPN = characterStroke.getTranRUS();
                            break;
                        case 11:
                            tranSPN = characterStroke.getTranCHN();
                            break;
                        case 12:
                            tranSPN = characterStroke.getTranJPN();
                            break;
                        case 13:
                            tranSPN = characterStroke.getTranKRN();
                            break;
                        default:
                            switch (i11) {
                                case 18:
                                    tranSPN = characterStroke.getTranIDN();
                                    break;
                                case 19:
                                    tranSPN = characterStroke.getTranPOL();
                                    break;
                                case 20:
                                    tranSPN = characterStroke.getTranITN();
                                    break;
                                case 21:
                                    tranSPN = characterStroke.getTranTUR();
                                    break;
                                default:
                                    tranSPN = characterStroke.getTranENG();
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            tranSPN = characterStroke.getTranHINDI();
        }
        if (i11 != 3) {
            if (tranSPN == null) {
                tranSPN = characterStroke.getTranENG();
            } else {
                if (oz.q.K0(tranSPN)) {
                    tranSPN = null;
                }
                if (tranSPN == null) {
                    tranSPN = characterStroke.getTranENG();
                }
            }
        }
        if (tranSPN == null) {
            tranSPN = BuildConfig.VERSION_NAME;
        }
        String strQ0 = x.q0(tranSPN, "!@@@!", "; ");
        if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(((o0) b.c()).f27733a.keyLanguage))) {
            zhuyin = characterStroke.getZhuyin();
            if (zhuyin.length() == 0) {
                zhuyin = characterStroke.getLuoma();
            }
        } else {
            zhuyin = (String) ry.m.q0(oz.q.W0(characterStroke.getZhuyin(), new String[]{"/"}, 0, 6));
        }
        String str = zhuyin;
        long charId = characterStroke.getCharId();
        String character = characterStroke.getCharacter();
        String strokeData = characterStroke.getStrokeData();
        Uri EMPTY = Uri.EMPTY;
        kotlin.jvm.internal.m.e(EMPTY, "EMPTY");
        ry.r rVar = ry.r.f50854a;
        return new CourseCharacter(charId, character, BuildConfig.VERSION_NAME, str, 0, strQ0, BuildConfig.VERSION_NAME, rVar, rVar, strokeData, null, EMPTY, null, 5120, null);
    }

    public static final ArrayList a(List list, long j11, Calendar calendar, long j12, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < i11; i12++) {
            calendar.setTimeInMillis(j11);
            if (j12 != calendar.get(16)) {
                j11 -= ((long) calendar.get(16)) - j12;
                calendar.setTimeInMillis(j11);
                j12 = calendar.get(16);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DailyLearnHistory dailyLearnHistory = (DailyLearnHistory) it.next();
                long timeInMillis = calendar.getTimeInMillis();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(timeInMillis);
                Integer numValueOf = Integer.valueOf(simpleDateFormat.format(calendar2.getTime()));
                kotlin.jvm.internal.m.e(numValueOf, "valueOf(...)");
                if (Long.parseLong(dailyLearnHistory.getId()) == numValueOf.intValue()) {
                    arrayList.add(dailyLearnHistory);
                    break;
                }
            }
            j11 -= 86400000;
        }
        return arrayList;
    }

    public static final ArrayList b(List list, long j11, Calendar calendar, long j12, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < i11; i12++) {
            calendar.setTimeInMillis(j11);
            if (j12 != calendar.get(16)) {
                j11 -= ((long) calendar.get(16)) - j12;
                calendar.setTimeInMillis(j11);
                j12 = calendar.get(16);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DailyLearnWithLearnTimeHistory dailyLearnWithLearnTimeHistory = (DailyLearnWithLearnTimeHistory) it.next();
                long timeInMillis = calendar.getTimeInMillis();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(timeInMillis);
                Integer numValueOf = Integer.valueOf(simpleDateFormat.format(calendar2.getTime()));
                kotlin.jvm.internal.m.e(numValueOf, "valueOf(...)");
                if (Long.parseLong(dailyLearnWithLearnTimeHistory.getId()) == numValueOf.intValue()) {
                    arrayList.add(dailyLearnWithLearnTimeHistory);
                    break;
                }
            }
            j11 -= 86400000;
        }
        return arrayList;
    }

    public static q3.a d(int i11) {
        if (v(i11)) {
            return new q3.a("zh");
        }
        if (w(i11)) {
            return new q3.a("ja");
        }
        if (x(i11)) {
            return new q3.a("ko");
        }
        return null;
    }

    public static String e(int i11) {
        if (i11 == 40) {
            return "itoc";
        }
        if (i11 == 57) {
            return "thai";
        }
        if (i11 == 61) {
            return "hindi";
        }
        if (i11 == 63) {
            return "ukr";
        }
        if (i11 == 65) {
            return "grk";
        }
        if (i11 == 69) {
            return "mal";
        }
        switch (i11) {
            case 0:
                return "cn";
            case 1:
                return "jp";
            case 2:
                return "kr";
            case 3:
                return "en";
            case 4:
                return "esoc";
            case 5:
                return "froc";
            case 6:
                return "deoc";
            case 7:
                return "vt";
            case 8:
                return "ptoc";
            default:
                switch (i11) {
                    case 10:
                    case 22:
                        return "ruoc";
                    case 11:
                        return "cnup";
                    case 12:
                        return "jpup";
                    case 13:
                        return "krup";
                    case 14:
                        return "esoc";
                    case 15:
                        return "froc";
                    case 16:
                        return "deoc";
                    case 17:
                        return "ptoc";
                    case 18:
                        return "idn";
                    case 19:
                        return "pol";
                    case 20:
                        return "itoc";
                    case 21:
                        return "tur";
                    default:
                        switch (i11) {
                            case 47:
                            case 48:
                                return "esus";
                            case 49:
                            case 50:
                                return "enes";
                            case 51:
                                return "ara";
                            default:
                                switch (i11) {
                                    case 53:
                                    case 54:
                                        return "frus";
                                    case 55:
                                        return "ara";
                                    default:
                                        switch (i11) {
                                            case 100:
                                                return "cze";
                                            case 101:
                                                return "nld";
                                            case 102:
                                                return "nor";
                                            default:
                                                return BuildConfig.VERSION_NAME;
                                        }
                                }
                        }
                }
        }
    }

    public static String f(int i11) {
        if (i11 == 40) {
            return "it";
        }
        if (i11 == 57) {
            return "thai";
        }
        if (i11 == 61) {
            return "hindi";
        }
        if (i11 == 63) {
            return "ukr";
        }
        if (i11 == 65) {
            return "grk";
        }
        if (i11 == 69) {
            return "mal";
        }
        switch (i11) {
            case 0:
            case 11:
                return "cn";
            case 1:
            case 12:
                return "jp";
            case 2:
            case 13:
                return "kr";
            case 3:
                return "en";
            case 4:
            case 14:
                return "es";
            case 5:
            case 15:
                return "fr";
            case 6:
            case 16:
                return "de";
            case 7:
                return "vt";
            case 8:
            case 17:
                return "pt";
            case 9:
                return "tch";
            case 10:
            case 22:
                return "ru";
            case 18:
                return "idn";
            case 19:
                return "pol";
            case 20:
                return "it";
            case 21:
                return "tur";
            default:
                switch (i11) {
                    case 47:
                    case 48:
                        return "esus";
                    case 49:
                    case 50:
                        return "enes";
                    case 51:
                        return "ara";
                    default:
                        switch (i11) {
                            case 53:
                            case 54:
                                return "frus";
                            case 55:
                                return "ara";
                            default:
                                return BuildConfig.VERSION_NAME;
                        }
                }
        }
    }

    public static boolean g(int i11) {
        return w(i11) || x(i11) || v(i11);
    }

    public static boolean h(int i11) {
        return w(i11) || x(i11) || v(i11);
    }

    public static boolean i(int i11) {
        return ry.l.m0(new Integer[]{0, 1, 2, 4, 5, 6, 8, 14, 15, 16, 17, 13, 12, 11, 20, 40, 10, 22}).contains(Integer.valueOf(i11));
    }

    public static boolean j(int i11) {
        return g(i11) || h(i11) || w(i11);
    }

    public static String l(int i11) {
        if (i11 == 40) {
            return "it";
        }
        if (i11 == 57) {
            return "thai";
        }
        if (i11 == 61) {
            return "hindi";
        }
        if (i11 == 63) {
            return "ukr";
        }
        if (i11 == 65) {
            return "grk";
        }
        if (i11 == 69) {
            return "mal";
        }
        switch (i11) {
            case 0:
            case 11:
                return "cn";
            case 1:
            case 12:
                return "jp";
            case 2:
            case 13:
                return "kr";
            case 3:
                return "en";
            case 4:
            case 14:
                return "es";
            case 5:
            case 15:
                return "fr";
            case 6:
            case 16:
                return "de";
            case 7:
                return "vt";
            case 8:
            case 17:
                return "pt";
            case 9:
                return "tch";
            case 10:
            case 22:
                return "ru";
            case 18:
                return "idn";
            case 19:
                return "pol";
            case 20:
                return "it";
            case 21:
                return "tur";
            default:
                switch (i11) {
                    case 47:
                    case 48:
                        return "esus";
                    case 49:
                    case 50:
                        return "en";
                    case 51:
                        return "ara";
                    default:
                        switch (i11) {
                            case 53:
                            case 54:
                                return "fr";
                            case 55:
                                return "ara";
                            default:
                                return "jp";
                        }
                }
        }
    }

    public static String n(int i11) {
        if (i11 == 40) {
            return "it-IT";
        }
        if (i11 == 51) {
            return "ar-AE";
        }
        if (i11 == 57) {
            return "th-TH";
        }
        if (i11 == 61) {
            return "hi-IN";
        }
        if (i11 == 63) {
            return "uk-UA";
        }
        if (i11 == 65) {
            return "el-GR";
        }
        if (i11 == 69) {
            return "ms-MY";
        }
        if (i11 == 47 || i11 == 48) {
            return "es-US";
        }
        switch (i11) {
            case 0:
            case 11:
                return "zh-CN";
            case 1:
            case 12:
                return "ja-JP";
            case 2:
            case 13:
                return "ko-KR";
            case 3:
                return "en-US";
            case 4:
            case 14:
                return "es-ES";
            case 5:
            case 15:
                return "fr-FR";
            case 6:
            case 16:
                return "de-DE";
            case 7:
                return "vi-VN";
            case 8:
            case 17:
                return "pt-PT";
            case 9:
                return "zh-TCH";
            case 10:
            case 22:
                return "ru-RU";
            case 18:
                return "id-ID";
            case 19:
                return "pl-PL";
            case 20:
                return "it-IT";
            case 21:
                return "tr-TR";
            default:
                switch (i11) {
                    case 53:
                    case 54:
                        return "fr-FR";
                    case 55:
                        return "ar-AE";
                    default:
                        switch (i11) {
                            case 100:
                                return "cs-CZ";
                            case 101:
                                return "nl-NL";
                            case 102:
                                return "nb-NO";
                            default:
                                return "en-US";
                        }
                }
        }
    }

    public static String q(long j11, int i11, int i12) {
        String str;
        String strConcat = k(i12).concat("_");
        if (i11 == 0) {
            str = "w_";
        } else if (i11 == 1) {
            str = "s_";
        } else if (i11 == 2) {
            str = "c_";
        } else if (i11 != 3) {
            str = i11 != 4 ? BuildConfig.VERSION_NAME : "cd_";
        } else {
            str = "tp_";
        }
        return e0.k(j11, strConcat, str);
    }

    public static boolean r(int i11) {
        return ry.l.m0(new Integer[]{51, 55, 49, 65, 61, 18, 69, 19, 57, 21, 63}).contains(Integer.valueOf(i11));
    }

    public static boolean s(int i11) {
        return ry.l.m0(new Integer[]{4, 14, 47, 48, 5, 15, 53, 54}).contains(Integer.valueOf(i11));
    }

    public static Locale t(int i11) {
        if (i11 == 4) {
            return new Locale("es");
        }
        if (i11 == 5) {
            return new Locale("fr");
        }
        if (i11 == 6) {
            return new Locale("de");
        }
        if (i11 == 7) {
            return new Locale(aYZzTH.jNbdij);
        }
        if (i11 != 21) {
            return i11 != 61 ? new Locale("en") : new Locale("hi");
        }
        return new Locale("tr");
    }

    public static boolean u(int i11) {
        return v(i11) || w(i11) || x(i11);
    }

    public static boolean v(int i11) {
        return ry.l.D(new Integer[]{11, 0}, Integer.valueOf(i11));
    }

    public static boolean w(int i11) {
        return ry.l.D(new Integer[]{12, 1}, Integer.valueOf(i11));
    }

    public static boolean x(int i11) {
        return ry.l.D(new Integer[]{13, 2}, Integer.valueOf(i11));
    }

    public static boolean y(int i11) {
        return !ry.l.m0(new Integer[]{11, 13, 12, 14, 15, 16, 17, 22, 40, 48, 50, 54, 55}).contains(Integer.valueOf(i11));
    }

    public static boolean z(int i11) {
        return ry.l.m0(new Integer[]{51, 55, 61, 57}).contains(Integer.valueOf(i11));
    }

    public static String c(int i11) {
        if (i11 == 0) {
            return "Simplified Chinese";
        }
        if (i11 == 1) {
            return "Japanese";
        }
        if (i11 == 2) {
            return "Korean";
        }
        if (i11 == 51) {
            return "Arabic";
        }
        if (i11 == 57) {
            return ealNNtLp.GpdQuJoQeLK;
        }
        if (i11 == 61) {
            return "Hindi";
        }
        if (i11 == 63) {
            return "Ukrainian";
        }
        switch (i11) {
            case 4:
                return "Spanish";
            case 5:
                return "French";
            case 6:
                return "German";
            case 7:
                return xTCJ.DdDjQyHyjD;
            case 8:
                return "Portuguese";
            case 9:
                return "Traditional Chinese";
            case 10:
                return "Russian";
            default:
                switch (i11) {
                    case 18:
                        return "Indonesian";
                    case 19:
                        return "Polish";
                    case 20:
                        return "Italian";
                    case 21:
                        return "Turkish";
                    default:
                        switch (i11) {
                            case 100:
                                return "Czech";
                            case 101:
                                return "Dutch";
                            case 102:
                                return "Norwegian";
                            default:
                                return "English";
                        }
                }
        }
    }

    public static String k(int i11) {
        if (i11 == 40) {
            return "itocup";
        }
        if (i11 == 51) {
            return "ara";
        }
        if (i11 == 57) {
            return "thai";
        }
        if (i11 == 61) {
            return "hindi";
        }
        if (i11 == 63) {
            return "ukr";
        }
        if (i11 == 65) {
            return "grk";
        }
        if (i11 == 69) {
            return "mal";
        }
        if (i11 == 47) {
            return "esus";
        }
        if (i11 == 48) {
            return "esusup";
        }
        switch (i11) {
            case 0:
                return "cn";
            case 1:
                return "jp";
            case 2:
                return "kr";
            case 3:
                return "en";
            case 4:
                return "esoc";
            case 5:
                return "froc";
            case 6:
                return "deoc";
            case 7:
                return "vt";
            case 8:
                return "ptoc";
            default:
                switch (i11) {
                    case 10:
                        return "ruoc";
                    case 11:
                        return "cnup";
                    case 12:
                        return "jpup";
                    case 13:
                        return iFLeRCXvYCGdPW.WjpbCeOVutVjh;
                    case 14:
                        return "esocup";
                    case 15:
                        return "frocup";
                    case 16:
                        return "deocup";
                    case 17:
                        return "ptocup";
                    case 18:
                        return "idn";
                    case 19:
                        return "pol";
                    case 20:
                        return "itoc";
                    case 21:
                        return "tur";
                    case 22:
                        return "ruocup";
                    default:
                        switch (i11) {
                            case 53:
                                return "frus";
                            case 54:
                                return "frusup";
                            case 55:
                                return "araup";
                            default:
                                return BuildConfig.VERSION_NAME;
                        }
                }
        }
    }

    public static String m(int i11) {
        if (i11 == 40) {
            return "http://192.168.31.31:1111/AdminZG/";
        }
        if (i11 == 57) {
            return "http://192.168.31.31:1313/AdminZG/";
        }
        if (i11 == 61) {
            return "http://192.168.31.31:2626/AdminZG/";
        }
        if (i11 == 63) {
            return "http://192.168.31.31:2727/AdminZG/";
        }
        if (i11 == 65) {
            return "http://192.168.31.31:2828/AdminZG/";
        }
        if (i11 == 69) {
            return "http://192.168.31.31:3232/AdminZG/";
        }
        switch (i11) {
            case 0:
                return "http://192.168.31.31:1515/AdminZG/";
            case 1:
                return "http://192.168.31.31:1818/AdminZG/";
            case 2:
                return "http://192.168.31.31:1717/AdminZG/";
            case 3:
                return "http://192.168.31.31:1616/AdminZG/";
            case 4:
                return "http://192.168.31.31:2121/AdminZG/";
            case 5:
                return "http://192.168.31.31:2323/AdminZG/";
            case 6:
                break;
            case 7:
                return "http://192.168.31.31:2020/AdminZG/";
            case 8:
                return "http://192.168.31.31:1919/AdminZG/";
            default:
                switch (i11) {
                    case 10:
                    case 22:
                        return "http://192.168.31.31:2424/AdminZG/";
                    case 11:
                        return "http://192.168.31.31:3535/AdminZG/";
                    case 12:
                        return "http://192.168.31.31:3838/AdminZG/";
                    case 13:
                        return "http://192.168.31.31:3737/AdminZG/";
                    case 14:
                        return "http://192.168.31.31:2121/AdminZG/";
                    case 15:
                        return "http://192.168.31.31:2323/AdminZG/";
                    case 16:
                        break;
                    case 17:
                        return "http://192.168.31.31:1919/AdminZG/";
                    case 18:
                        return "http://192.168.31.31:1414/AdminZG/";
                    case 19:
                        return "http://192.168.31.31:2929/AdminZG/";
                    case 20:
                        return "http://192.168.31.31:1111/AdminZG/";
                    case 21:
                        return "http://192.168.31.31:2525/AdminZG/";
                    default:
                        switch (i11) {
                            case 47:
                            case 48:
                                return "http://192.168.31.31:4141/AdminZG/";
                            case 49:
                            case 50:
                                return "http://192.168.31.31:9601/AdminZG/";
                            case 51:
                                return "http://192.168.31.31:1010/AdminZG/";
                            default:
                                switch (i11) {
                                    case 53:
                                    case 54:
                                        return "http://192.168.31.31:4343/AdminZG/";
                                    case 55:
                                        return "http://192.168.31.31:1010/AdminZG/";
                                    default:
                                        return BuildConfig.VERSION_NAME;
                                }
                        }
                }
                break;
        }
        return evRpcb.xWYnMkS;
    }

    public static String p(int i11) {
        if (i11 == 40) {
            return "it_";
        }
        if (i11 == 57) {
            return "thai_";
        }
        if (i11 == 61) {
            return "hindi_";
        }
        if (i11 == 63) {
            return "ukr_";
        }
        if (i11 == 65) {
            return "grk_";
        }
        if (i11 == 69) {
            return "mal_";
        }
        switch (i11) {
            case 0:
                return "cn_";
            case 1:
                return "jp_";
            case 2:
                return "kr_";
            case 3:
                return "en_";
            case 4:
                return "es_";
            case 5:
                return "fr_";
            case 6:
                return "de_";
            case 7:
                return "vt_";
            case 8:
                return "pt_";
            default:
                switch (i11) {
                    case 10:
                    case 22:
                        return "ru_";
                    case 11:
                        return "cnup_";
                    case 12:
                        return "jpup_";
                    case 13:
                        return "krup_";
                    case 14:
                        return "es_";
                    case 15:
                        return "fr_";
                    case 16:
                        return "de_";
                    case 17:
                        return "pt_";
                    case 18:
                        return "idn_";
                    case 19:
                        return "pol_";
                    case 20:
                        return "it_";
                    case 21:
                        return "tur_";
                    default:
                        switch (i11) {
                            case 47:
                            case 48:
                                return "esus_";
                            case 49:
                            case 50:
                                return "enes_";
                            case 51:
                                break;
                            default:
                                switch (i11) {
                                    case 53:
                                    case 54:
                                        return "frus_";
                                    case 55:
                                        break;
                                    default:
                                        return BuildConfig.VERSION_NAME;
                                }
                                break;
                        }
                        return LwKl.KVj;
                }
        }
    }

    public static String o(long j11, int i11, int i12) {
        String str;
        String strP = p(i12);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        str = gkbGsXmgaxRjJ.BDpP;
                    } else if (i11 != 4) {
                        str = BuildConfig.VERSION_NAME;
                    } else {
                        str = "syllable_";
                    }
                } else {
                    str = "c_";
                }
            } else {
                str = "s_";
            }
        } else {
            str = "w_";
        }
        return e0.k(j11, strP, str);
    }
}
