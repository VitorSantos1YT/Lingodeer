package ck;

import b7.e0;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jz.d;
import jz.e;
import ns.o;
import nv.p;
import oz.q;
import ry.m;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {
    public final String K;
    public final String L;

    public a() {
        super(0);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        String str = BuildConfig.VERSION_NAME;
        this.K = i11 == 3 ? ";87;249;251;250;255;257;80;596;592;593;594;597;600;685;719;1052;910;951;952;953;954;1496;86;85;91;231;233;235;234;236;242;421;1872;1873;590;591;602;606;610;1772;1774;1773;608;609;2190;2191;692;687;689;899;900;902;912;958;959;960;1399;1412;96;127;83;" : BuildConfig.VERSION_NAME;
        this.L = x.n().keyLanguage == 3 ? ";96;97;98;99;100;106;107;108;109;110;111;206;207;208;209;210;211;214;217;218;219;1811;1812;1813;1814;1815;1685;" : str;
    }

    @Override // ck.b, oi.c
    public final void n(qi.a aVar, ArrayList arrayList, boolean z11, int i11) {
        ArrayList arrayList2 = (ArrayList) this.f44926b;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().isAudioModel) {
            ((List) p.e(4, 1, arrayList2, (List) arrayList2.get(1))).add(5);
            if (!q.v0(this.K, p.m(aVar.f47799b, ";", ";"), false)) {
                ((List) arrayList2.get(1)).add(7);
            }
        } else {
            ((List) p.e(2, 1, arrayList2, (List) arrayList2.get(1))).add(5);
            ((List) arrayList2.get(1)).add(13);
        }
        ArrayList arrayListL = oi.c.l(i(), aVar.f47798a, aVar.f47799b);
        if (!arrayListL.isEmpty() && ((List) arrayList2.get(1)).size() > 1) {
            ((List) arrayList2.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListL)).intValue()));
        }
        ArrayList arrayListK = k(i(), aVar.f47798a);
        if (!arrayListK.isEmpty() && ((List) arrayList2.get(1)).size() > 1) {
            ((List) arrayList2.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListK)).intValue()));
        }
        String.valueOf(arrayList2.get(1));
        Collection collection = (Collection) arrayList2.get(1);
        d dVar = e.f37397a;
        aVar.f47800c = ((Number) m.I0(collection)).intValue();
        aVar.f47802e = (List) arrayList2.get(1);
        if (arrayList.size() == 1) {
            aVar.f47800c = 13;
        }
    }

    @Override // ck.b, oi.c
    public final void q(qi.a aVar, ArrayList arrayList, boolean z11) {
        ArrayList arrayList2 = (ArrayList) this.f44926b;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().isAudioModel) {
            ((List) p.e(3, 1, arrayList2, (List) arrayList2.get(1))).add(4);
            if (!q.v0(this.L, p.m(aVar.f47799b, ";", ";"), false)) {
                ((List) arrayList2.get(1)).add(7);
            }
            ((List) arrayList2.get(1)).add(9);
            ((List) arrayList2.get(1)).add(11);
        } else {
            ((List) arrayList2.get(1)).add(9);
            ((List) arrayList2.get(1)).add(10);
        }
        ArrayList arrayListL = oi.c.l(i(), aVar.f47798a, aVar.f47799b);
        if (!arrayListL.isEmpty() && ((List) arrayList2.get(1)).size() > 1) {
            ((List) arrayList2.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListL)).intValue()));
        }
        ArrayList arrayListK = k(i(), aVar.f47798a);
        if (!arrayListK.isEmpty() && ((List) arrayList2.get(1)).size() > 1) {
            ((List) arrayList2.get(1)).remove(Integer.valueOf(((Number) p.f(1, arrayListK)).intValue()));
        }
        String.valueOf(arrayList2.get(1));
        Collection collection = (Collection) arrayList2.get(1);
        d dVar = e.f37397a;
        aVar.f47800c = ((Number) m.I0(collection)).intValue();
        aVar.f47802e = (List) arrayList2.get(1);
    }

    /* JADX WARN: Code duplicated, block: B:164:0x03a8  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v47 */
    @Override // oi.c
    public final List s(String str) {
        List listK;
        List listT;
        String str2;
        int i11;
        List listK2;
        List listT2;
        String str3;
        List listK3;
        List listT3;
        int i12;
        int iC;
        List listK4;
        boolean z11;
        List listT4;
        List listK5;
        List listT5;
        List listK6;
        List listT6;
        List listK7;
        List listT7;
        boolean z12;
        List listK8;
        List listT8;
        ArrayList arrayList = (ArrayList) this.f44926b;
        ArrayList arrayList2 = (ArrayList) this.f44927c;
        this.f44925a = w4.c.m(str, "repeatRegex");
        ?? r9 = 0;
        Matcher matcherW = p.w(0, "#", "compile(...)", str);
        if (matcherW.find()) {
            ArrayList arrayList3 = new ArrayList(10);
            int iC2 = 0;
            do {
                iC2 = p.c(matcherW, str, iC2, arrayList3);
            } while (matcherW.find());
            p.B(iC2, str, arrayList3);
            listK = arrayList3;
        } else {
            listK = o.K(str.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        r rVar = r.f50854a;
        if (zIsEmpty) {
            listT = rVar;
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listT = rVar;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                listT = e0.t(listIterator, 1, listK);
                break;
            }
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        ArrayList arrayList4 = new ArrayList();
        int length = strArr.length;
        int i13 = 0;
        while (true) {
            str2 = "input";
            if (i13 >= length) {
                break;
            }
            String strQ0 = strArr[i13];
            if (oz.x.s0(strQ0, "3:", r9)) {
                strQ0 = oz.x.q0(oz.x.q0(strQ0, ":-", ":0-"), ":;", ":0;");
            }
            Matcher matcherW2 = p.w(r9, ";", "compile(...)", strQ0);
            if (matcherW2.find()) {
                ArrayList arrayList5 = new ArrayList(10);
                int iC3 = 0;
                do {
                    iC3 = p.c(matcherW2, strQ0, iC3, arrayList5);
                } while (matcherW2.find());
                p.B(iC3, strQ0, arrayList5);
                listK6 = arrayList5;
            } else {
                listK6 = o.K(strQ0.toString());
            }
            if (listK6.isEmpty()) {
                listT6 = rVar;
                break;
            }
            ListIterator listIterator2 = listK6.listIterator(listK6.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listT6 = rVar;
                    break;
                }
                if (((String) listIterator2.previous()).length() != 0) {
                    listT6 = e0.t(listIterator2, 1, listK6);
                    break;
                }
            }
            String[] strArr2 = (String[]) listT6.toArray(new String[0]);
            int i14 = strArr2.length > 2 ? Integer.parseInt(strArr2[2]) : 1;
            String str4 = strArr2[0];
            Matcher matcher = e0.u(0, "-", "compile(...)", str4, "input").matcher(str4);
            if (matcher.find()) {
                ArrayList arrayList6 = new ArrayList(10);
                int iC4 = 0;
                do {
                    iC4 = p.c(matcher, str4, iC4, arrayList6);
                } while (matcher.find());
                p.B(iC4, str4, arrayList6);
                listK7 = arrayList6;
            } else {
                listK7 = o.K(str4.toString());
            }
            if (listK7.isEmpty()) {
                listT7 = rVar;
                break;
            }
            ListIterator listIterator3 = listK7.listIterator(listK7.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    listT7 = rVar;
                    break;
                }
                if (((String) listIterator3.previous()).length() != 0) {
                    listT7 = e0.t(listIterator3, 1, listK7);
                    break;
                }
            }
            String[] strArr3 = (String[]) listT7.toArray(new String[0]);
            if (strArr3.length >= 3) {
                int length2 = strArr3.length;
                int i15 = 0;
                z12 = true;
                while (i15 < length2) {
                    int i16 = i15;
                    String str5 = strArr3[i16];
                    r rVar2 = rVar;
                    int i17 = length;
                    Matcher matcher2 = e0.u(0, ":", "compile(...)", str5, "input").matcher(str5);
                    if (matcher2.find()) {
                        ArrayList arrayList7 = new ArrayList(10);
                        int iC5 = 0;
                        do {
                            iC5 = p.c(matcher2, str5, iC5, arrayList7);
                        } while (matcher2.find());
                        p.B(iC5, str5, arrayList7);
                        listK8 = arrayList7;
                    } else {
                        listK8 = o.K(str5.toString());
                    }
                    if (listK8.isEmpty()) {
                        listT8 = rVar2;
                        break;
                    }
                    ListIterator listIterator4 = listK8.listIterator(listK8.size());
                    while (true) {
                        if (!listIterator4.hasPrevious()) {
                            listT8 = rVar2;
                            break;
                        }
                        if (((String) listIterator4.previous()).length() != 0) {
                            listT8 = e0.t(listIterator4, 1, listK8);
                            break;
                        }
                    }
                    String[] strArr4 = (String[]) listT8.toArray(new String[0]);
                    if ((!kotlin.jvm.internal.m.a(strArr4[0], "0") || !kotlin.jvm.internal.m.a(strArr4[2], "0")) && (!kotlin.jvm.internal.m.a(strArr4[0], "3") || !kotlin.jvm.internal.m.a(strArr4[2], "0"))) {
                        z12 = false;
                    }
                    i15 = i16 + 1;
                    rVar = rVar2;
                    length = i17;
                    i13 = i13;
                }
            } else {
                z12 = false;
            }
            r rVar3 = rVar;
            int i18 = length;
            int i19 = i13;
            if (z12) {
                arrayList4.add(str4);
            } else {
                for (int i21 : j3.P(strArr3.length, i14)) {
                    arrayList4.add(strArr3[i21]);
                }
            }
            i13 = i19 + 1;
            strArr = strArr;
            rVar = rVar3;
            length = i18;
            r9 = 0;
        }
        r rVar4 = rVar;
        int size = arrayList4.size();
        int i22 = 0;
        while (i22 < size) {
            Object obj = arrayList4.get(i22);
            kotlin.jvm.internal.m.e(obj, "get(...)");
            String str6 = (String) obj;
            int i23 = 0;
            if (q.W0(str6, new String[]{"-"}, 0, 6).size() >= 3) {
                ArrayList arrayList8 = new ArrayList();
                List<String> listW0 = q.W0(str6, new String[]{"-"}, 0, 6);
                int i24 = 6;
                for (String str7 : listW0) {
                    Matcher matcher3 = e0.u(i23, ":", "compile(...)", str7, str2).matcher(str7);
                    if (matcher3.find()) {
                        ArrayList arrayList9 = new ArrayList(10);
                        int i25 = 0;
                        while (true) {
                            iC = p.c(matcher3, str7, i25, arrayList9);
                            if (!matcher3.find()) {
                                break;
                            }
                            i25 = iC;
                        }
                        p.B(iC, str7, arrayList9);
                        listK4 = arrayList9;
                    } else {
                        listK4 = o.K(str7.toString());
                    }
                    if (listK4.isEmpty()) {
                        z11 = true;
                        listT4 = rVar4;
                        break;
                    }
                    ListIterator listIterator5 = listK4.listIterator(listK4.size());
                    while (true) {
                        if (!listIterator5.hasPrevious()) {
                            z11 = true;
                            listT4 = rVar4;
                            break;
                        }
                        if (!(((String) listIterator5.previous()).length() == 0)) {
                            z11 = true;
                            listT4 = e0.t(listIterator5, 1, listK4);
                            break;
                        }
                    }
                    arrayList8.add(Long.valueOf(((String[]) listT4.toArray(new String[0]))[z11 ? 1 : 0]));
                    Pattern patternCompile = Pattern.compile(":");
                    kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                    q.U0(0);
                    Matcher matcher4 = patternCompile.matcher(str7);
                    if (matcher4.find()) {
                        ArrayList arrayList10 = new ArrayList(10);
                        int iC6 = 0;
                        while (true) {
                            iC6 = p.c(matcher4, str7, iC6, arrayList10);
                            if (!matcher4.find()) {
                                break;
                            }
                            matcher4 = matcher4;
                        }
                        p.B(iC6, str7, arrayList10);
                        listK5 = arrayList10;
                    } else {
                        listK5 = o.K(str7.toString());
                    }
                    if (listK5.isEmpty()) {
                        listT5 = rVar4;
                        break;
                    }
                    ListIterator listIterator6 = listK5.listIterator(listK5.size());
                    while (true) {
                        if (!listIterator6.hasPrevious()) {
                            listT5 = rVar4;
                            break;
                        }
                        if (!(((String) listIterator6.previous()).length() == 0)) {
                            listT5 = e0.t(listIterator6, 1, listK5);
                            break;
                        }
                    }
                    i24 = Integer.parseInt(((String[]) listT5.toArray(new String[0]))[2]);
                    i23 = 0;
                    size = size;
                }
                i11 = size;
                int i26 = i23;
                int i27 = Integer.parseInt((String) q.W0((CharSequence) listW0.get(i26), new String[]{":"}, i26, 6).get(i26));
                if (i27 != 0) {
                    if (i27 != 3) {
                        i12 = i24;
                    } else {
                        i12 = 14;
                    }
                } else if (i24 == 0) {
                    i12 = 6;
                } else {
                    i12 = i24;
                }
                qi.a aVar = new qi.a();
                aVar.f47798a = i27;
                aVar.f47799b = 0L;
                aVar.f47800c = i12;
                aVar.f47801d = arrayList8;
                i().add(aVar);
                str3 = str2;
            } else {
                i11 = size;
                String str8 = str2;
                arrayList.clear();
                arrayList2.clear();
                arrayList.add(new ArrayList());
                arrayList.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                arrayList2.add(new ArrayList());
                Pattern patternCompile2 = Pattern.compile(":");
                kotlin.jvm.internal.m.e(patternCompile2, "compile(...)");
                q.U0(0);
                Matcher matcher5 = patternCompile2.matcher(str6);
                if (matcher5.find()) {
                    ArrayList arrayList11 = new ArrayList(10);
                    int iC7 = 0;
                    do {
                        iC7 = p.c(matcher5, str6, iC7, arrayList11);
                    } while (matcher5.find());
                    p.B(iC7, str6, arrayList11);
                    listK2 = arrayList11;
                } else {
                    listK2 = o.K(str6.toString());
                }
                if (listK2.isEmpty()) {
                    listT2 = rVar4;
                    break;
                }
                ListIterator listIterator7 = listK2.listIterator(listK2.size());
                while (true) {
                    if (!listIterator7.hasPrevious()) {
                        listT2 = rVar4;
                        break;
                    }
                    if (!(((String) listIterator7.previous()).length() == 0)) {
                        listT2 = e0.t(listIterator7, 1, listK2);
                        break;
                    }
                }
                String[] strArr5 = (String[]) listT2.toArray(new String[0]);
                qi.a aVar2 = new qi.a();
                aVar2.f47798a = Integer.parseInt(strArr5[0]);
                aVar2.f47799b = Integer.parseInt(strArr5[1]);
                String str9 = strArr5[2];
                str3 = str8;
                Matcher matcher6 = e0.u(0, ",", "compile(...)", str9, str3).matcher(str9);
                if (matcher6.find()) {
                    ArrayList arrayList12 = new ArrayList(10);
                    int iC8 = 0;
                    do {
                        iC8 = p.c(matcher6, str9, iC8, arrayList12);
                    } while (matcher6.find());
                    p.B(iC8, str9, arrayList12);
                    listK3 = arrayList12;
                } else {
                    listK3 = o.K(str9.toString());
                }
                if (listK3.isEmpty()) {
                    listT3 = rVar4;
                    break;
                }
                ListIterator listIterator8 = listK3.listIterator(listK3.size());
                while (true) {
                    if (!listIterator8.hasPrevious()) {
                        listT3 = rVar4;
                        break;
                    }
                    if (!(((String) listIterator8.previous()).length() == 0)) {
                        listT3 = e0.t(listIterator8, 1, listK3);
                        break;
                    }
                }
                String[] strArr6 = (String[]) listT3.toArray(new String[0]);
                ArrayList arrayList13 = new ArrayList();
                for (String str10 : strArr6) {
                    arrayList13.add(Integer.valueOf(Integer.parseInt(str10)));
                }
                boolean zD = d(i(), aVar2.f47798a, aVar2.f47799b);
                if (aVar2.f47798a == 0) {
                    q(aVar2, arrayList13, zD);
                } else {
                    n(aVar2, arrayList13, zD, i22);
                }
                i().add(aVar2);
            }
            i22++;
            str2 = str3;
            size = i11;
        }
        if (q.v0("release", "debug", false) && xt.b.f56282d) {
            t(i().subList(0, 1));
        }
        return i();
    }
}
