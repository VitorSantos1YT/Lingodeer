package sk;

import a9.i;
import android.view.View;
import android.widget.TextView;
import b7.e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.franchskill.ui.learn.FRSyllableIntroductionActivity2;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import oz.q;
import oz.x;
import ry.r;
import se.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements tx.a, BaseQuickAdapter.OnItemChildClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FRSyllableIntroductionActivity2 f51717a;

    public /* synthetic */ c(FRSyllableIntroductionActivity2 fRSyllableIntroductionActivity2) {
        this.f51717a = fRSyllableIntroductionActivity2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[LOOP:3: B:68:0x0182->B:104:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01e2 A[EDGE_INSN: B:112:0x01e2->B:91:0x01e2 BREAK  A[LOOP:5: B:76:0x01bd->B:113:0x01bd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0157  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    /* JADX WARN: Code duplicated, block: B:67:0x017a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0188  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01df  */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
    public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String string;
        List listK;
        List listT;
        int length;
        int i12;
        boolean z11;
        String strC;
        int i13;
        boolean z12;
        Matcher matcherW;
        ArrayList arrayList;
        int iC;
        List listK2;
        ListIterator listIterator;
        List listK3;
        FRSyllableIntroductionActivity2 fRSyllableIntroductionActivity2 = this.f51717a;
        g gVar = fRSyllableIntroductionActivity2.I0;
        int i14 = FRSyllableIntroductionActivity2.K0;
        int id2 = view.getId();
        if (id2 == R.id.ll_parent) {
            string = ((TextView) view.findViewById(R.id.tv_content)).getText().toString();
        } else {
            string = (id2 == R.id.tv_right || id2 == R.id.tv_right_top || id2 == R.id.tv_right_btm) ? ((TextView) view).getText().toString() : BuildConfig.VERSION_NAME;
        }
        Matcher matcher = e0.u(0, " ", "compile(...)", string, "input").matcher(string);
        if (matcher.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iC2 = 0;
            do {
                iC2 = p.c(matcher, string, iC2, arrayList2);
            } while (matcher.find());
            p.B(iC2, string, arrayList2);
            listK = arrayList2;
        } else {
            listK = o.K(string.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        List listT2 = r.f50854a;
        if (!zIsEmpty) {
            ListIterator listIterator2 = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listT = listT2;
                    break;
                } else if (((String) listIterator2.previous()).length() != 0) {
                    listT = e0.t(listIterator2, 1, listK);
                    break;
                }
            }
        } else {
            listT = listT2;
            break;
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        if (strArr.length > 1) {
            String strN = p0.n("getDefault(...)", strArr[0], "toLowerCase(...)");
            String str = strArr[1];
            Locale locale = Locale.getDefault();
            m.e(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            m.e(lowerCase, "toLowerCase(...)");
            if (strN.equals(lowerCase) || x.s0(strArr[1], "[", false) || x.s0(strArr[1], "(", false)) {
                Matcher matcherW2 = p.w(0, " ", "compile(...)", string);
                if (matcherW2.find()) {
                    ArrayList arrayList3 = new ArrayList(10);
                    int iC3 = 0;
                    do {
                        iC3 = p.c(matcherW2, string, iC3, arrayList3);
                    } while (matcherW2.find());
                    p.B(iC3, string, arrayList3);
                    listK3 = arrayList3;
                } else {
                    listK3 = o.K(string.toString());
                }
                if (!listK3.isEmpty()) {
                    ListIterator listIterator3 = listK3.listIterator(listK3.size());
                    while (listIterator3.hasPrevious()) {
                        if (((String) listIterator3.previous()).length() != 0) {
                            listT2 = e0.t(listIterator3, 1, listK3);
                            break;
                        }
                    }
                }
                String str2 = ((String[]) listT2.toArray(new String[0]))[0];
                Locale locale2 = Locale.getDefault();
                m.e(locale2, "getDefault(...)");
                String lowerCase2 = str2.toLowerCase(locale2);
                m.e(lowerCase2, "toLowerCase(...)");
                strC = gVar.c(lowerCase2);
            } else if (q.v0(string, "/", false)) {
                matcherW = p.w(0, "/", "compile(...)", string);
                if (matcherW.find()) {
                    arrayList = new ArrayList(10);
                    iC = 0;
                    do {
                        iC = p.c(matcherW, string, iC, arrayList);
                    } while (matcherW.find());
                    p.B(iC, string, arrayList);
                    listK2 = arrayList;
                } else {
                    listK2 = o.K(string.toString());
                }
                if (!listK2.isEmpty()) {
                    listIterator = listK2.listIterator(listK2.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() == 0) {
                            listT2 = e0.t(listIterator, 1, listK2);
                            break;
                        }
                    }
                }
                String str3 = ((String[]) listT2.toArray(new String[0]))[0];
                Locale locale3 = Locale.getDefault();
                m.e(locale3, "getDefault(...)");
                String lowerCase3 = str3.toLowerCase(locale3);
                m.e(lowerCase3, "toLowerCase(...)");
                strC = gVar.c(lowerCase3);
            } else {
                length = string.length() - 1;
                i12 = 0;
                z11 = false;
                while (i12 <= length) {
                    if (z11) {
                        i13 = length;
                    } else {
                        i13 = i12;
                    }
                    if (m.h(string.charAt(i13), 32) <= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11) {
                        if (!z12) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z12) {
                        i12++;
                    } else {
                        z11 = true;
                    }
                }
                String strG = w4.c.g(string, length, 1, i12);
                Locale locale4 = Locale.getDefault();
                m.e(locale4, "getDefault(...)");
                String lowerCase4 = strG.toLowerCase(locale4);
                m.e(lowerCase4, "toLowerCase(...)");
                strC = gVar.c(lowerCase4);
            }
        } else if (q.v0(string, "/", false)) {
            matcherW = p.w(0, "/", "compile(...)", string);
            if (matcherW.find()) {
                listK2 = o.K(string.toString());
            } else {
                arrayList = new ArrayList(10);
                iC = 0;
                do {
                    iC = p.c(matcherW, string, iC, arrayList);
                } while (matcherW.find());
                p.B(iC, string, arrayList);
                listK2 = arrayList;
            }
            if (!listK2.isEmpty()) {
                listIterator = listK2.listIterator(listK2.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() == 0) {
                        listT2 = e0.t(listIterator, 1, listK2);
                        break;
                    }
                }
            }
            String str4 = ((String[]) listT2.toArray(new String[0]))[0];
            Locale locale5 = Locale.getDefault();
            m.e(locale5, "getDefault(...)");
            String lowerCase5 = str4.toLowerCase(locale5);
            m.e(lowerCase5, "toLowerCase(...)");
            strC = gVar.c(lowerCase5);
        } else {
            length = string.length() - 1;
            i12 = 0;
            z11 = false;
            while (i12 <= length) {
                if (z11) {
                    i13 = i12;
                } else {
                    i13 = length;
                }
                if (m.h(string.charAt(i13), 32) <= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11) {
                    if (z12) {
                        z11 = true;
                    } else {
                        i12++;
                    }
                } else {
                    if (!z12) {
                        break;
                        break;
                    }
                    length--;
                }
            }
            String strG2 = w4.c.g(string, length, 1, i12);
            Locale locale6 = Locale.getDefault();
            m.e(locale6, "getDefault(...)");
            String lowerCase6 = strG2.toLowerCase(locale6);
            m.e(lowerCase6, "toLowerCase(...)");
            strC = gVar.c(lowerCase6);
        }
        m.c(strC);
        i iVar = fRSyllableIntroductionActivity2.J0;
        qy.q qVar = fv.b.f28186a;
        iVar.v(fv.b.c(strC, null, null));
    }

    @Override // tx.a
    public void run() {
        int i11 = FRSyllableIntroductionActivity2.K0;
        this.f51717a.y(BuildConfig.VERSION_NAME, true);
    }
}
