package sj;

import b7.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import oz.q;
import ry.r;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f51714b;

    public a(int i11) {
        List listK;
        List listT;
        List listK2;
        List listT2;
        List listK3;
        List listT3;
        List listK4;
        List listT4;
        this.f51713a = i11;
        switch (i11) {
            case 1:
                this.f51714b = new HashMap();
                new HashMap();
                break;
            case 2:
                HashMap map = new HashMap();
                this.f51714b = map;
                map.clear();
                Pattern patternCompile = Pattern.compile("\n");
                m.e(patternCompile, "compile(...)");
                q.U0(0);
                Matcher matcher = patternCompile.matcher("A a\tpt-f-zy-a\nB b\tpt-f-zy-b\nC c\tpt-f-zy-c\nD d\tpt-f-zy-d\nE e\tpt-f-zy-e\nF f\tpt-f-zy-f\nG g\tpt-f-zy-g\nH h\tpt-f-zy-h\nI i\tpt-f-zy-i\nJ j\tpt-f-zy-j\nK k\tpt-f-zy-k\nL l\tpt-f-zy-l\nM m\tpt-f-zy-m\nN n\tpt-f-zy-n\nO o\tpt-f-zy-o\nP p\tpt-f-zy-p\nQ q\tpt-f-zy-q\nR r\tpt-f-zy-r\nS s\tpt-f-zy-s\nT t\tpt-f-zy-t\nU u\tpt-f-zy-u\nV v\tpt-f-zy-v\nW w\tpt-f-zy-w\nX x\tpt-f-zy-x\nY y\tpt-f-zy-y\nZ z\tpt-f-zy-z\nolá\tpt-f-zy-ola\ncafé\tpt-f-zy-cafe\nvida\tpt-f-zy-vida\navó\tpt-f-zy-avo\numa\tpt-f-zy-uma\nboa\tpt-f-zy-boa\nporta\tpt-f-zy-porta\ndama\tpt-f-zy-dama\ntema\tpt-f-zy-tema\nficar\tpt-f-zy-ficar\nvida\tpt-f-zy-vida1\njanela\tpt-f-zy-janela\nmala\tpt-f-zy-mala\nmala\tpt-f-zy-mala1\nnome\tpt-f-zy-nome\ncá\tpt-f-zy-ca\ncedo\tpt-f-zy-cedo\nmoça\tpt-f-zy-moca\ngosto\tpt-f-zy-gosto\ngigante\tpt-f-zy-gigante\nhoje\tpt-f-zy-hoje\nzero\tpt-f-zy-zero\ndez\tpt-f-zy-dez\nverde\tpt-f-zy-verde\ndia\tpt-f-zy-dia\ndente\tpt-f-zy-dente\ntio\tpt-f-zy-tio\nrato\tpt-f-zy-rato\ncarro\tpt-f-zy-carro\ncara\tpt-f-zy-cara\nsala\tpt-f-zy-sala\nlápis\tpt-f-zy-lapis\nmesa\tpt-f-zy-mesa\nmesmo\tpt-f-zy-mesmo\nxarope\tpt-f-zy-xarope\nfênix\tpt-f-zy-fenix\nexame\tpt-f-zy-exame\nestudo\tpt-f-zy-estudo\nsaúde\tpt-f-zy-saude\nóleo\tpt-f-zy-oleo\namigo\tpt-f-zy-amigo\nmotivo\tpt-f-zy-motivo\nirmã\tpt-f-zy-irma\nbem\tpt-f-zy-bem\nfim\tpt-f-zy-fim\nbom\tpt-f-zy-bom\num\tpt-f-zy-um\nchá\tpt-f-zy-cha\nminha\tpt-f-zy-minha\ntrabalham\tpt-f-zy-trabalham\nniguém\tpt-f-zy-niguem\nigual\tpt-f-zy-igual\nquente\tpt-f-zy-quente\nqual\tpt-f-zy-qual\nolá\tpt-f-zy-ola1\nlâmpada\tpt-f-zy-lampada\nmaçã\tpt-f-zy-maca\nàs 9h\tpt-f-zy-as-9h");
                if (matcher.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iC = 0;
                    do {
                        iC = p.c(matcher, "A a\tpt-f-zy-a\nB b\tpt-f-zy-b\nC c\tpt-f-zy-c\nD d\tpt-f-zy-d\nE e\tpt-f-zy-e\nF f\tpt-f-zy-f\nG g\tpt-f-zy-g\nH h\tpt-f-zy-h\nI i\tpt-f-zy-i\nJ j\tpt-f-zy-j\nK k\tpt-f-zy-k\nL l\tpt-f-zy-l\nM m\tpt-f-zy-m\nN n\tpt-f-zy-n\nO o\tpt-f-zy-o\nP p\tpt-f-zy-p\nQ q\tpt-f-zy-q\nR r\tpt-f-zy-r\nS s\tpt-f-zy-s\nT t\tpt-f-zy-t\nU u\tpt-f-zy-u\nV v\tpt-f-zy-v\nW w\tpt-f-zy-w\nX x\tpt-f-zy-x\nY y\tpt-f-zy-y\nZ z\tpt-f-zy-z\nolá\tpt-f-zy-ola\ncafé\tpt-f-zy-cafe\nvida\tpt-f-zy-vida\navó\tpt-f-zy-avo\numa\tpt-f-zy-uma\nboa\tpt-f-zy-boa\nporta\tpt-f-zy-porta\ndama\tpt-f-zy-dama\ntema\tpt-f-zy-tema\nficar\tpt-f-zy-ficar\nvida\tpt-f-zy-vida1\njanela\tpt-f-zy-janela\nmala\tpt-f-zy-mala\nmala\tpt-f-zy-mala1\nnome\tpt-f-zy-nome\ncá\tpt-f-zy-ca\ncedo\tpt-f-zy-cedo\nmoça\tpt-f-zy-moca\ngosto\tpt-f-zy-gosto\ngigante\tpt-f-zy-gigante\nhoje\tpt-f-zy-hoje\nzero\tpt-f-zy-zero\ndez\tpt-f-zy-dez\nverde\tpt-f-zy-verde\ndia\tpt-f-zy-dia\ndente\tpt-f-zy-dente\ntio\tpt-f-zy-tio\nrato\tpt-f-zy-rato\ncarro\tpt-f-zy-carro\ncara\tpt-f-zy-cara\nsala\tpt-f-zy-sala\nlápis\tpt-f-zy-lapis\nmesa\tpt-f-zy-mesa\nmesmo\tpt-f-zy-mesmo\nxarope\tpt-f-zy-xarope\nfênix\tpt-f-zy-fenix\nexame\tpt-f-zy-exame\nestudo\tpt-f-zy-estudo\nsaúde\tpt-f-zy-saude\nóleo\tpt-f-zy-oleo\namigo\tpt-f-zy-amigo\nmotivo\tpt-f-zy-motivo\nirmã\tpt-f-zy-irma\nbem\tpt-f-zy-bem\nfim\tpt-f-zy-fim\nbom\tpt-f-zy-bom\num\tpt-f-zy-um\nchá\tpt-f-zy-cha\nminha\tpt-f-zy-minha\ntrabalham\tpt-f-zy-trabalham\nniguém\tpt-f-zy-niguem\nigual\tpt-f-zy-igual\nquente\tpt-f-zy-quente\nqual\tpt-f-zy-qual\nolá\tpt-f-zy-ola1\nlâmpada\tpt-f-zy-lampada\nmaçã\tpt-f-zy-maca\nàs 9h\tpt-f-zy-as-9h", iC, arrayList);
                    } while (matcher.find());
                    arrayList.add("A a\tpt-f-zy-a\nB b\tpt-f-zy-b\nC c\tpt-f-zy-c\nD d\tpt-f-zy-d\nE e\tpt-f-zy-e\nF f\tpt-f-zy-f\nG g\tpt-f-zy-g\nH h\tpt-f-zy-h\nI i\tpt-f-zy-i\nJ j\tpt-f-zy-j\nK k\tpt-f-zy-k\nL l\tpt-f-zy-l\nM m\tpt-f-zy-m\nN n\tpt-f-zy-n\nO o\tpt-f-zy-o\nP p\tpt-f-zy-p\nQ q\tpt-f-zy-q\nR r\tpt-f-zy-r\nS s\tpt-f-zy-s\nT t\tpt-f-zy-t\nU u\tpt-f-zy-u\nV v\tpt-f-zy-v\nW w\tpt-f-zy-w\nX x\tpt-f-zy-x\nY y\tpt-f-zy-y\nZ z\tpt-f-zy-z\nolá\tpt-f-zy-ola\ncafé\tpt-f-zy-cafe\nvida\tpt-f-zy-vida\navó\tpt-f-zy-avo\numa\tpt-f-zy-uma\nboa\tpt-f-zy-boa\nporta\tpt-f-zy-porta\ndama\tpt-f-zy-dama\ntema\tpt-f-zy-tema\nficar\tpt-f-zy-ficar\nvida\tpt-f-zy-vida1\njanela\tpt-f-zy-janela\nmala\tpt-f-zy-mala\nmala\tpt-f-zy-mala1\nnome\tpt-f-zy-nome\ncá\tpt-f-zy-ca\ncedo\tpt-f-zy-cedo\nmoça\tpt-f-zy-moca\ngosto\tpt-f-zy-gosto\ngigante\tpt-f-zy-gigante\nhoje\tpt-f-zy-hoje\nzero\tpt-f-zy-zero\ndez\tpt-f-zy-dez\nverde\tpt-f-zy-verde\ndia\tpt-f-zy-dia\ndente\tpt-f-zy-dente\ntio\tpt-f-zy-tio\nrato\tpt-f-zy-rato\ncarro\tpt-f-zy-carro\ncara\tpt-f-zy-cara\nsala\tpt-f-zy-sala\nlápis\tpt-f-zy-lapis\nmesa\tpt-f-zy-mesa\nmesmo\tpt-f-zy-mesmo\nxarope\tpt-f-zy-xarope\nfênix\tpt-f-zy-fenix\nexame\tpt-f-zy-exame\nestudo\tpt-f-zy-estudo\nsaúde\tpt-f-zy-saude\nóleo\tpt-f-zy-oleo\namigo\tpt-f-zy-amigo\nmotivo\tpt-f-zy-motivo\nirmã\tpt-f-zy-irma\nbem\tpt-f-zy-bem\nfim\tpt-f-zy-fim\nbom\tpt-f-zy-bom\num\tpt-f-zy-um\nchá\tpt-f-zy-cha\nminha\tpt-f-zy-minha\ntrabalham\tpt-f-zy-trabalham\nniguém\tpt-f-zy-niguem\nigual\tpt-f-zy-igual\nquente\tpt-f-zy-quente\nqual\tpt-f-zy-qual\nolá\tpt-f-zy-ola1\nlâmpada\tpt-f-zy-lampada\nmaçã\tpt-f-zy-maca\nàs 9h\tpt-f-zy-as-9h".subSequence(iC, 1454).toString());
                    listK = arrayList;
                } else {
                    listK = o.K("A a\tpt-f-zy-a\nB b\tpt-f-zy-b\nC c\tpt-f-zy-c\nD d\tpt-f-zy-d\nE e\tpt-f-zy-e\nF f\tpt-f-zy-f\nG g\tpt-f-zy-g\nH h\tpt-f-zy-h\nI i\tpt-f-zy-i\nJ j\tpt-f-zy-j\nK k\tpt-f-zy-k\nL l\tpt-f-zy-l\nM m\tpt-f-zy-m\nN n\tpt-f-zy-n\nO o\tpt-f-zy-o\nP p\tpt-f-zy-p\nQ q\tpt-f-zy-q\nR r\tpt-f-zy-r\nS s\tpt-f-zy-s\nT t\tpt-f-zy-t\nU u\tpt-f-zy-u\nV v\tpt-f-zy-v\nW w\tpt-f-zy-w\nX x\tpt-f-zy-x\nY y\tpt-f-zy-y\nZ z\tpt-f-zy-z\nolá\tpt-f-zy-ola\ncafé\tpt-f-zy-cafe\nvida\tpt-f-zy-vida\navó\tpt-f-zy-avo\numa\tpt-f-zy-uma\nboa\tpt-f-zy-boa\nporta\tpt-f-zy-porta\ndama\tpt-f-zy-dama\ntema\tpt-f-zy-tema\nficar\tpt-f-zy-ficar\nvida\tpt-f-zy-vida1\njanela\tpt-f-zy-janela\nmala\tpt-f-zy-mala\nmala\tpt-f-zy-mala1\nnome\tpt-f-zy-nome\ncá\tpt-f-zy-ca\ncedo\tpt-f-zy-cedo\nmoça\tpt-f-zy-moca\ngosto\tpt-f-zy-gosto\ngigante\tpt-f-zy-gigante\nhoje\tpt-f-zy-hoje\nzero\tpt-f-zy-zero\ndez\tpt-f-zy-dez\nverde\tpt-f-zy-verde\ndia\tpt-f-zy-dia\ndente\tpt-f-zy-dente\ntio\tpt-f-zy-tio\nrato\tpt-f-zy-rato\ncarro\tpt-f-zy-carro\ncara\tpt-f-zy-cara\nsala\tpt-f-zy-sala\nlápis\tpt-f-zy-lapis\nmesa\tpt-f-zy-mesa\nmesmo\tpt-f-zy-mesmo\nxarope\tpt-f-zy-xarope\nfênix\tpt-f-zy-fenix\nexame\tpt-f-zy-exame\nestudo\tpt-f-zy-estudo\nsaúde\tpt-f-zy-saude\nóleo\tpt-f-zy-oleo\namigo\tpt-f-zy-amigo\nmotivo\tpt-f-zy-motivo\nirmã\tpt-f-zy-irma\nbem\tpt-f-zy-bem\nfim\tpt-f-zy-fim\nbom\tpt-f-zy-bom\num\tpt-f-zy-um\nchá\tpt-f-zy-cha\nminha\tpt-f-zy-minha\ntrabalham\tpt-f-zy-trabalham\nniguém\tpt-f-zy-niguem\nigual\tpt-f-zy-igual\nquente\tpt-f-zy-quente\nqual\tpt-f-zy-qual\nolá\tpt-f-zy-ola1\nlâmpada\tpt-f-zy-lampada\nmaçã\tpt-f-zy-maca\nàs 9h\tpt-f-zy-as-9h");
                }
                boolean zIsEmpty = listK.isEmpty();
                r rVar = r.f50854a;
                if (zIsEmpty) {
                    listT = rVar;
                } else {
                    ListIterator listIterator = listK.listIterator(listK.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            listT = rVar;
                        } else if (((String) listIterator.previous()).length() != 0) {
                            listT = e0.t(listIterator, 1, listK);
                        }
                    }
                }
                for (String str : (String[]) listT.toArray(new String[0])) {
                    Matcher matcher2 = e0.u(0, "\t", "compile(...)", str, "input").matcher(str);
                    if (matcher2.find()) {
                        ArrayList arrayList2 = new ArrayList(10);
                        int iC2 = 0;
                        do {
                            iC2 = p.c(matcher2, str, iC2, arrayList2);
                        } while (matcher2.find());
                        p.B(iC2, str, arrayList2);
                        listK2 = arrayList2;
                    } else {
                        listK2 = o.K(str.toString());
                    }
                    if (listK2.isEmpty()) {
                        listT2 = rVar;
                    }
                    ListIterator listIterator2 = listK2.listIterator(listK2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            if (((String) listIterator2.previous()).length() != 0) {
                                listT2 = e0.t(listIterator2, 1, listK2);
                            }
                        } else {
                            listT2 = rVar;
                        }
                        break;
                    }
                    break;
                    String[] strArr = (String[]) listT2.toArray(new String[0]);
                    this.f51714b.put(strArr[0], strArr[1]);
                }
                break;
            default:
                HashMap map2 = new HashMap();
                this.f51714b = map2;
                map2.clear();
                Pattern patternCompile2 = Pattern.compile("\n");
                m.e(patternCompile2, "compile(...)");
                q.U0(0);
                Matcher matcher3 = patternCompile2.matcher("Ä\ta1\nÖ\to1\nÜ\tu1\nẞ\t#1\nä\ta1\nö\to1\nü\tu1\nß\t#1");
                if (matcher3.find()) {
                    ArrayList arrayList3 = new ArrayList(10);
                    int iC3 = 0;
                    do {
                        iC3 = p.c(matcher3, "Ä\ta1\nÖ\to1\nÜ\tu1\nẞ\t#1\nä\ta1\nö\to1\nü\tu1\nß\t#1", iC3, arrayList3);
                    } while (matcher3.find());
                    arrayList3.add("Ä\ta1\nÖ\to1\nÜ\tu1\nẞ\t#1\nä\ta1\nö\to1\nü\tu1\nß\t#1".subSequence(iC3, 39).toString());
                    listK3 = arrayList3;
                } else {
                    listK3 = o.K("Ä\ta1\nÖ\to1\nÜ\tu1\nẞ\t#1\nä\ta1\nö\to1\nü\tu1\nß\t#1");
                }
                boolean zIsEmpty2 = listK3.isEmpty();
                r rVar2 = r.f50854a;
                if (zIsEmpty2) {
                    listT3 = rVar2;
                } else {
                    ListIterator listIterator3 = listK3.listIterator(listK3.size());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            listT3 = rVar2;
                        } else if (((String) listIterator3.previous()).length() != 0) {
                            listT3 = e0.t(listIterator3, 1, listK3);
                        }
                    }
                }
                for (String str2 : (String[]) listT3.toArray(new String[0])) {
                    Matcher matcher4 = e0.u(0, "\t", "compile(...)", str2, "input").matcher(str2);
                    if (matcher4.find()) {
                        ArrayList arrayList4 = new ArrayList(10);
                        int iC4 = 0;
                        do {
                            iC4 = p.c(matcher4, str2, iC4, arrayList4);
                        } while (matcher4.find());
                        p.B(iC4, str2, arrayList4);
                        listK4 = arrayList4;
                    } else {
                        listK4 = o.K(str2.toString());
                    }
                    if (listK4.isEmpty()) {
                        listT4 = rVar2;
                    }
                    ListIterator listIterator4 = listK4.listIterator(listK4.size());
                    while (true) {
                        if (listIterator4.hasPrevious()) {
                            if (((String) listIterator4.previous()).length() != 0) {
                                listT4 = e0.t(listIterator4, 1, listK4);
                            }
                        } else {
                            listT4 = rVar2;
                        }
                        break;
                    }
                    break;
                    String[] strArr2 = (String[]) listT4.toArray(new String[0]);
                    this.f51714b.put(strArr2[0], strArr2[1]);
                }
                break;
        }
    }

    public String a(String charStr) {
        String strD;
        switch (this.f51713a) {
            case 0:
                HashMap map = this.f51714b;
                if (map.containsKey(charStr)) {
                    return (String) map.get(charStr);
                }
                StringBuilder sb2 = new StringBuilder();
                int length = charStr.length();
                for (int i11 = 0; i11 < length; i11++) {
                    String strValueOf = String.valueOf(charStr.charAt(i11));
                    if (map.containsKey(strValueOf)) {
                        strValueOf = (String) map.get(strValueOf);
                    }
                    sb2.append(strValueOf);
                }
                String string = sb2.toString();
                int iB = c.b(1, string, "toString(...)");
                int i12 = 0;
                boolean z11 = false;
                while (i12 <= iB) {
                    boolean z12 = m.h(string.charAt(!z11 ? i12 : iB), 32) <= 0;
                    if (z11) {
                        if (!z12) {
                            return c.g(string, iB, 1, i12);
                        }
                        iB--;
                    } else if (z12) {
                        i12++;
                    } else {
                        z11 = true;
                    }
                }
                return c.g(string, iB, 1, i12);
            default:
                m.f(charStr, "charStr");
                HashMap map2 = this.f51714b;
                if (map2.containsKey(charStr)) {
                    Object obj = map2.get(charStr);
                    m.c(obj);
                    return (String) obj;
                }
                if (charStr.length() == 1) {
                    Locale locale = Locale.ROOT;
                    String upperCase = charStr.toUpperCase(locale);
                    m.e(upperCase, "toUpperCase(...)");
                    String lowerCase = charStr.toLowerCase(locale);
                    m.e(lowerCase, "toLowerCase(...)");
                    strD = ep.a.D(upperCase, " ", lowerCase);
                } else {
                    strD = charStr;
                }
                if (map2.containsKey(strD)) {
                    Object obj2 = map2.get(strD);
                    m.c(obj2);
                    return (String) obj2;
                }
                StringBuilder sb3 = new StringBuilder();
                int length2 = charStr.length();
                for (int i13 = 0; i13 < length2; i13++) {
                    String strValueOf2 = String.valueOf(charStr.charAt(i13));
                    if (map2.containsKey(strValueOf2)) {
                        Object obj3 = map2.get(strValueOf2);
                        m.c(obj3);
                        strValueOf2 = (String) obj3;
                    }
                    sb3.append(strValueOf2);
                }
                String string2 = sb3.toString();
                m.e(string2, "toString(...)");
                int length3 = string2.length() - 1;
                int i14 = 0;
                boolean z13 = false;
                while (i14 <= length3) {
                    boolean z14 = m.h(string2.charAt(!z13 ? i14 : length3), 32) <= 0;
                    if (z13) {
                        if (!z14) {
                            return string2.subSequence(i14, length3 + 1).toString();
                        }
                        length3--;
                    } else if (z14) {
                        i14++;
                    } else {
                        z13 = true;
                    }
                }
                return string2.subSequence(i14, length3 + 1).toString();
        }
    }
}
