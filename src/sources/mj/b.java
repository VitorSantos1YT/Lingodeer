package mj;

import a9.i;
import android.view.View;
import android.widget.TextView;
import b7.e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.deskill.ui.learn.DESyllableIntroductionActivity;
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
import oz.x;
import qy.q;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements BaseQuickAdapter.OnItemChildClickListener, tx.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DESyllableIntroductionActivity f41162a;

    public /* synthetic */ b(DESyllableIntroductionActivity dESyllableIntroductionActivity) {
        this.f41162a = dESyllableIntroductionActivity;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x015a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0165  */
    /* JADX WARN: Code duplicated, block: B:63:0x0167  */
    /* JADX WARN: Code duplicated, block: B:66:0x0174  */
    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    /* JADX WARN: Code duplicated, block: B:74:0x0183  */
    /* JADX WARN: Code duplicated, block: B:86:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0186 A[EDGE_INSN: B:91:0x0186->B:75:0x0186 BREAK  A[LOOP:3: B:60:0x0161->B:92:0x0161], SYNTHETIC] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
    public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String string;
        List listK;
        List listT;
        int length;
        int i12;
        boolean z11;
        String strA;
        int i13;
        boolean z12;
        List listK2;
        DESyllableIntroductionActivity dESyllableIntroductionActivity = this.f41162a;
        sj.a aVar = dESyllableIntroductionActivity.E0;
        int i14 = DESyllableIntroductionActivity.G0;
        int id2 = view.getId();
        if (id2 == R.id.ll_parent) {
            string = ((TextView) view.findViewById(R.id.tv_content)).getText().toString();
        } else {
            string = (id2 == R.id.tv_right_2 || id2 == R.id.tv_right) ? ((TextView) view).getText().toString() : BuildConfig.VERSION_NAME;
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
        if (strArr.length > 1) {
            String strN = p0.n("getDefault(...)", strArr[0], "toLowerCase(...)");
            String str = strArr[1];
            Locale locale = Locale.getDefault();
            m.e(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            m.e(lowerCase, "toLowerCase(...)");
            if (!strN.equals(lowerCase) && !x.s0(strArr[1], "[", false) && !x.s0(strArr[1], "(", false)) {
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
                Locale locale2 = Locale.getDefault();
                m.e(locale2, "getDefault(...)");
                String lowerCase2 = strG.toLowerCase(locale2);
                m.e(lowerCase2, "toLowerCase(...)");
                strA = aVar.a(lowerCase2);
                m.c(strA);
            } else if (m.a(strArr[0], "übersetzen")) {
                strA = i11 == 0 ? "u1bersetzen_1" : "u1bersetzen_2";
            } else {
                Matcher matcherW = p.w(0, " ", "compile(...)", string);
                if (matcherW.find()) {
                    ArrayList arrayList2 = new ArrayList(10);
                    int iC2 = 0;
                    do {
                        iC2 = p.c(matcherW, string, iC2, arrayList2);
                    } while (matcherW.find());
                    p.B(iC2, string, arrayList2);
                    listK2 = arrayList2;
                } else {
                    listK2 = o.K(string.toString());
                }
                if (!listK2.isEmpty()) {
                    ListIterator listIterator2 = listK2.listIterator(listK2.size());
                    while (listIterator2.hasPrevious()) {
                        if (((String) listIterator2.previous()).length() != 0) {
                            listT2 = e0.t(listIterator2, 1, listK2);
                            break;
                        }
                    }
                }
                String str2 = ((String[]) listT2.toArray(new String[0]))[0];
                Locale locale3 = Locale.getDefault();
                m.e(locale3, "getDefault(...)");
                String lowerCase3 = str2.toLowerCase(locale3);
                m.e(lowerCase3, "toLowerCase(...)");
                strA = aVar.a(lowerCase3);
                m.c(strA);
            }
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
            Locale locale4 = Locale.getDefault();
            m.e(locale4, "getDefault(...)");
            String lowerCase4 = strG2.toLowerCase(locale4);
            m.e(lowerCase4, "toLowerCase(...)");
            strA = aVar.a(lowerCase4);
            m.c(strA);
        }
        i iVar = dESyllableIntroductionActivity.F0;
        q qVar = fv.b.f28186a;
        iVar.v(fv.b.c(strA, null, null));
    }

    @Override // tx.a
    public void run() {
        int i11 = DESyllableIntroductionActivity.G0;
        this.f41162a.v(BuildConfig.VERSION_NAME, true);
    }
}
