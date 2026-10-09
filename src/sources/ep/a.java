package ep;

import a0.r;
import android.content.Context;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ay.g0;
import bq.q;
import ca.l;
import com.google.gson.JsonObject;
import com.lingo.lingoskill.base.refill.k;
import com.lingo.lingoskill.espanskill.ui.learn.ESSyllableIntroductionActivity;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.object.OtherSubLanguageExpandableItem;
import j0.e2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import l1.k1;
import l1.s;
import l1.t;
import uz.i1;
import z1.o;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static void A(Integer num, r rVar, String str, j9.e eVar, String str2) {
        num.getClass();
        m.f(rVar, str);
        m.f(eVar, str2);
    }

    public static void B(String str, String str2, StringBuilder sb2, boolean z11, boolean z12) {
        sb2.append(z11);
        sb2.append(str);
        sb2.append(z12);
        sb2.append(str2);
    }

    public static void C(o oVar, float f5, s sVar, boolean z11) {
        j0.c.g(sVar, e2.g(oVar, f5));
        sVar.p(z11);
    }

    public static String D(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static g0 a(String str, String str2, k kVar) {
        return kVar.c(str + str2);
    }

    public static q b(ComposeView composeView, p1 p1Var, float f5) {
        composeView.setViewCompositionStrategy(p1Var);
        return new q(f5, 0, (byte) 0);
    }

    public static JsonObject c(String str, String str2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(str, str2);
        return jsonObject;
    }

    public static String d(String str, l lVar, String str2, l lVar2) {
        return str + lVar + str2 + lVar2;
    }

    public static String e(String str, String str2) {
        return str + str2;
    }

    public static String f(String str, String str2, Context context, String str3, int i11) {
        m.e(str, str2);
        return bq.m.w(context, str3).getString(i11);
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String h(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String i(String str, String str2, boolean z11) {
        return str + z11 + str2;
    }

    public static String j(StringBuilder sb2, int i11, char c11) {
        sb2.append(i11);
        sb2.append(c11);
        return sb2.toString();
    }

    public static String k(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String l(StringBuilder sb2, boolean z11, char c11) {
        sb2.append(z11);
        sb2.append(c11);
        return sb2.toString();
    }

    public static String m(s sVar, int i11, int i12, s sVar2, boolean z11) {
        sVar.d0(i11);
        String strE0 = ub.a.e0(sVar2, i12);
        sVar.p(z11);
        return strE0;
    }

    public static StringBuilder n(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static ArrayList o(Object obj) {
        com.bumptech.glide.e.F(obj);
        return new ArrayList();
    }

    public static List p(LanguageItem languageItem, String str, List list, LanguageItem languageItem2, OtherSubLanguageExpandableItem otherSubLanguageExpandableItem) {
        languageItem.setDescription(str);
        list.add(languageItem2);
        return otherSubLanguageExpandableItem.getSubItems();
    }

    public static List q(OtherSubLanguageExpandableItem otherSubLanguageExpandableItem) {
        otherSubLanguageExpandableItem.setSubItems(new ArrayList());
        return otherSubLanguageExpandableItem.getSubItems();
    }

    public static k1 r(int i11, s sVar) {
        k1 k1VarB = t.B(Integer.valueOf(i11));
        sVar.o0(k1VarB);
        return k1VarB;
    }

    public static k1 s(boolean z11, s sVar) {
        k1 k1VarB = t.B(Boolean.valueOf(z11));
        sVar.o0(k1VarB);
        return k1VarB;
    }

    public static ta.a t(int i11, RecyclerView recyclerView, ESSyllableIntroductionActivity eSSyllableIntroductionActivity) {
        recyclerView.setLayoutManager(new GridLayoutManager(i11));
        return eSSyllableIntroductionActivity.j();
    }

    public static void u(float f5, i1 i1Var, Object obj) {
        Float fValueOf = Float.valueOf(f5);
        i1Var.getClass();
        i1Var.l(obj, fValueOf);
    }

    public static void v(int i11, int i12, String str, String str2, StringBuilder sb2) {
        sb2.append(i11);
        sb2.append(str);
        sb2.append(i12);
        sb2.append(str2);
    }

    public static void w(int i11, fz.e eVar, s sVar, boolean z11) {
        eVar.invoke(sVar, Integer.valueOf(i11));
        sVar.p(z11);
    }

    public static void x(int i11, boolean z11, q qVar, ComposeView composeView) {
        composeView.setContent(new t1.d(qVar, z11, i11));
    }

    public static void y(long j11, String str, String str2, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(j11);
        sb2.append(str2);
    }

    public static void z(Context context, String str, int i11, TextView textView) {
        m.e(context, str);
        textView.setTextColor(context.getColor(i11));
    }
}
