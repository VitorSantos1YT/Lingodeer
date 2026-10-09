package xn;

import a9.i;
import android.view.View;
import android.widget.TextView;
import b7.e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.ptskill.ui.syllable.PTSyllableIntroductionActivity;
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

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements BaseQuickAdapter.OnItemChildClickListener, tx.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PTSyllableIntroductionActivity f56139a;

    public /* synthetic */ g(PTSyllableIntroductionActivity pTSyllableIntroductionActivity) {
        this.f56139a = pTSyllableIntroductionActivity;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
    public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String string;
        List listK;
        List listT;
        String strA;
        List listK2;
        PTSyllableIntroductionActivity pTSyllableIntroductionActivity = this.f56139a;
        sj.a aVar = pTSyllableIntroductionActivity.f22000m0;
        int i12 = PTSyllableIntroductionActivity.f21987p0;
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
            if (strN.equals(lowerCase) || x.s0(strArr[1], "[", false) || x.s0(strArr[1], "(", false)) {
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
                String string2 = q.i1(((String[]) listT2.toArray(new String[0]))[0]).toString();
                Locale locale2 = Locale.getDefault();
                m.e(locale2, "getDefault(...)");
                String lowerCase2 = string2.toLowerCase(locale2);
                m.e(lowerCase2, "toLowerCase(...)");
                strA = aVar.a(lowerCase2);
            } else {
                String string3 = q.i1(string).toString();
                Locale locale3 = Locale.getDefault();
                m.e(locale3, "getDefault(...)");
                String lowerCase3 = string3.toLowerCase(locale3);
                m.e(lowerCase3, "toLowerCase(...)");
                strA = aVar.a(lowerCase3);
            }
        } else {
            String string4 = q.i1(string).toString();
            Locale locale4 = Locale.getDefault();
            m.e(locale4, "getDefault(...)");
            String lowerCase4 = string4.toLowerCase(locale4);
            m.e(lowerCase4, "toLowerCase(...)");
            strA = aVar.a(lowerCase4);
        }
        i iVar = pTSyllableIntroductionActivity.f22001n0;
        qy.q qVar = fv.b.f28186a;
        iVar.v(fv.b.b(strA));
    }

    @Override // tx.a
    public void run() {
        int i11 = PTSyllableIntroductionActivity.f21987p0;
        this.f56139a.x(BuildConfig.VERSION_NAME, true);
    }
}
