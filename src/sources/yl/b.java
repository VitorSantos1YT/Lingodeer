package yl;

import a9.i;
import android.view.View;
import android.widget.TextView;
import b7.e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.itskill.ui.learn.ITSyllableIntroductionActivity;
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
public final /* synthetic */ class b implements BaseQuickAdapter.OnItemChildClickListener, tx.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ITSyllableIntroductionActivity f57862a;

    public /* synthetic */ b(ITSyllableIntroductionActivity iTSyllableIntroductionActivity) {
        this.f57862a = iTSyllableIntroductionActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
    public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List listK;
        List listT;
        String strA;
        List listK2;
        ITSyllableIntroductionActivity iTSyllableIntroductionActivity = this.f57862a;
        cm.a aVar = iTSyllableIntroductionActivity.R;
        int i12 = ITSyllableIntroductionActivity.f21889h0;
        m.d(view, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view;
        String string = textView.getText().toString();
        if (textView.getTag() != null) {
            Object tag = textView.getTag();
            m.d(tag, "null cannot be cast to non-null type kotlin.String");
            string = (String) tag;
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
        if (strArr.length <= 1 || !(p0.n("getDefault(...)", strArr[0], "toLowerCase(...)").equals(strArr[1]) || x.s0(strArr[1], "[", false) || x.s0(strArr[1], "(", false))) {
            strA = aVar.a(q.i1(string).toString());
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
            String str = ((String[]) listT2.toArray(new String[0]))[0];
            Locale locale = Locale.getDefault();
            m.e(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            m.e(lowerCase, "toLowerCase(...)");
            strA = aVar.a(q.i1(lowerCase).toString());
        }
        m.c(strA);
        i iVar = iTSyllableIntroductionActivity.S;
        qy.q qVar = fv.b.f28186a;
        iVar.v(fv.b.c(strA, null, null));
    }

    @Override // tx.a
    public void run() {
        int i11 = ITSyllableIntroductionActivity.f21889h0;
        this.f57862a.u(BuildConfig.VERSION_NAME, true);
    }
}
