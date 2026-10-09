package yj;

import a9.i;
import android.view.View;
import android.widget.TextView;
import b7.e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.englishskill.ui.learn.ENSyllableIntroductionActivity;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
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
import ob.e;
import oz.x;
import pt.ImS.aYZzTH;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements tx.a, BaseQuickAdapter.OnItemChildClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ENSyllableIntroductionActivity f57860a;

    @Override // tx.a
    public void run() {
        int i11 = ENSyllableIntroductionActivity.V;
        this.f57860a.u(BuildConfig.VERSION_NAME, true);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0143  */
    /* JADX WARN: Code duplicated, block: B:55:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0151  */
    /* JADX WARN: Code duplicated, block: B:60:0x015e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    /* JADX WARN: Code duplicated, block: B:68:0x016e  */
    /* JADX WARN: Code duplicated, block: B:80:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x016c A[EDGE_INSN: B:83:0x016c->B:67:0x016c BREAK  A[LOOP:3: B:54:0x014b->B:85:0x014b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0163 A[SYNTHETIC] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
    public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String string;
        List listK;
        List listT;
        int length;
        boolean z11;
        int i12;
        String strI;
        int i13;
        boolean z12;
        List listK2;
        ENSyllableIntroductionActivity eNSyllableIntroductionActivity = this.f57860a;
        e eVar = eNSyllableIntroductionActivity.R;
        int i14 = ENSyllableIntroductionActivity.V;
        int id2 = view.getId();
        if (id2 == R.id.ll_parent) {
            string = ((TextView) view.findViewById(R.id.tv_content)).getText().toString();
        } else {
            string = (id2 == R.id.tv_right || id2 == R.id.tv_right_2) ? ((TextView) view).getText().toString() : BuildConfig.VERSION_NAME;
        }
        Matcher matcher = e0.u(0, " ", "compile(...)", string, "input").matcher(string);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, string, iC, arrayList);
            } while (matcher.find());
            p.B(iC, string, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(string.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        List listT2 = r.f50854a;
        if (!zIsEmpty) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listT = listT2;
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    listT = e0.t(listIterator, 1, listK);
                    break;
                }
            }
        } else {
            listT = listT2;
            break;
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        int length2 = strArr.length;
        String str = bjXGJ.qLIAfWC;
        if (length2 > 1) {
            String strN = p0.n("getDefault(...)", strArr[0], str);
            String str2 = strArr[1];
            int i15 = 1;
            Locale ROOT = Locale.ROOT;
            m.e(ROOT, "ROOT");
            String lowerCase = str2.toLowerCase(ROOT);
            m.e(lowerCase, str);
            if (strN.equals(lowerCase) || x.s0(strArr[1], "(", false)) {
                Matcher matcherW = p.w(0, " ", "compile(...)", string);
                if (matcherW.find()) {
                    ArrayList arrayList2 = new ArrayList(10);
                    int iC2 = 0;
                    while (true) {
                        iC2 = p.c(matcherW, string, iC2, arrayList2);
                        if (!matcherW.find()) {
                            break;
                        } else {
                            i15 = 1;
                        }
                    }
                    p.B(iC2, string, arrayList2);
                    listK2 = arrayList2;
                } else {
                    listK2 = o.K(string.toString());
                }
                if (!listK2.isEmpty()) {
                    ListIterator listIterator2 = listK2.listIterator(listK2.size());
                    while (listIterator2.hasPrevious()) {
                        if (((String) listIterator2.previous()).length() != 0) {
                            listT2 = e0.t(listIterator2, i15, listK2);
                            break;
                        }
                    }
                }
                String str3 = ((String[]) listT2.toArray(new String[0]))[0];
                Locale locale = Locale.getDefault();
                m.e(locale, "getDefault(...)");
                String lowerCase2 = str3.toLowerCase(locale);
                m.e(lowerCase2, str);
                strI = eVar.i(lowerCase2);
            } else {
                length = string.length() - 1;
                z11 = false;
                i12 = 0;
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
                Locale locale2 = Locale.getDefault();
                m.e(locale2, "getDefault(...)");
                String lowerCase3 = strG.toLowerCase(locale2);
                m.e(lowerCase3, str);
                strI = eVar.i(x.q0(x.q0(lowerCase3, "[", "("), "]", aYZzTH.JgibNHoayeYOKU));
            }
        } else {
            length = string.length() - 1;
            z11 = false;
            i12 = 0;
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
            Locale locale3 = Locale.getDefault();
            m.e(locale3, "getDefault(...)");
            String lowerCase4 = strG2.toLowerCase(locale3);
            m.e(lowerCase4, str);
            strI = eVar.i(x.q0(x.q0(lowerCase4, "[", "("), "]", aYZzTH.JgibNHoayeYOKU));
        }
        m.c(strI);
        i iVar = eNSyllableIntroductionActivity.S;
        String strB = xt.b.a().b();
        iVar.v(strB + ("enes-f-zy-" + strI + ".mp3"));
    }
}
