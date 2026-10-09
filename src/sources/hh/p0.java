package hh;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.utilities.Validation;
import com.lingo.lingoskill.deskill.ui.learn.DESyllableIntroductionActivity;
import com.lingo.lingoskill.esusskill.ui.learn.ESUSSyllableIntroductionActivity;
import com.lingo.lingoskill.object.Word;
import j0.e2;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import rt.m5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class p0 {
    public static void A(l.a aVar, boolean z11, int i11) {
        aVar.m(z11);
        aVar.n();
        aVar.q();
        aVar.p(i11);
    }

    public static void B(z1.o oVar, float f5, l1.s sVar, boolean z11, boolean z12) {
        j0.c.g(sVar, e2.g(oVar, f5));
        sVar.p(z11);
        sVar.p(z12);
    }

    public static boolean C(Word word, String str) {
        String word2 = word.getWord();
        kotlin.jvm.internal.m.e(word2, str);
        return com.bumptech.glide.d.s(word2);
    }

    public static String[] D(l1.s sVar, int i11, int i12, l1.s sVar2, boolean z11) {
        sVar.d0(i11);
        String[] strArrC0 = ub.a.c0(sVar2, i12);
        sVar.p(z11);
        return strArrC0;
    }

    public static float a(float f5, float f11, float f12, float f13) {
        return ((f5 - f11) * f12) + f13;
    }

    public static int b(int i11, int i12, List list) {
        return (list.hashCode() + i11) * i12;
    }

    public static int c(p6.i iVar, int i11, int i12) {
        return (Integer.hashCode(iVar.f46317a) + i11) * i12;
    }

    public static DatabaseReference d(String str, long j11, FirebaseDatabase firebaseDatabase, String str2) {
        String str3 = str + j11;
        firebaseDatabase.a();
        if (str3 == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
        }
        Validation.b(str3);
        return new DatabaseReference(firebaseDatabase.f18978c, new Path(str3)).e(str2);
    }

    public static ClassCastException e(int i11, ArrayList arrayList) {
        arrayList.get(i11).getClass();
        return new ClassCastException();
    }

    public static Object f(int i11, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i11);
    }

    public static Object g(FlexboxLayout flexboxLayout, int i11, String str) {
        Object tag = flexboxLayout.getChildAt(i11).getTag();
        kotlin.jvm.internal.m.d(tag, str);
        return tag;
    }

    public static String h(int i11, String str, String str2) {
        return str + i11 + str2;
    }

    public static String i(int i11, String str, StringBuilder sb2) {
        sb2.append(i11);
        sb2.append(str);
        return sb2.toString();
    }

    public static String j(Word word, String str, int i11, int i12, String str2) {
        String word2 = word.getWord();
        kotlin.jvm.internal.m.e(word2, str);
        String strSubstring = word2.substring(i11, i12);
        kotlin.jvm.internal.m.e(strSubstring, str2);
        return strSubstring;
    }

    public static String k(Object obj, String str) {
        return str + obj;
    }

    public static String l(String str, int i11, String str2, int i12, String str3) {
        return str + i11 + str2 + i12 + str3;
    }

    public static String m(String str, String str2) {
        String upperCase = str.toUpperCase(bq.m.p());
        kotlin.jvm.internal.m.e(upperCase, str2);
        return upperCase;
    }

    public static String n(String str, String str2, String str3) {
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.m.e(locale, str);
        String lowerCase = str2.toLowerCase(locale);
        kotlin.jvm.internal.m.e(lowerCase, str3);
        return lowerCase;
    }

    public static String o(StringBuilder sb2, String str, char c11) {
        sb2.append(str);
        sb2.append(c11);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, boolean z11, String str) {
        sb2.append(z11);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder q(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static ArrayList r(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        return arrayList;
    }

    public static l1.g1 s(float f5, l1.s sVar) {
        l1.g1 g1Var = new l1.g1(f5);
        sVar.o0(g1Var);
        return g1Var;
    }

    public static m5 t(av.n nVar, sv.d dVar) {
        nVar.a();
        return new m5(dVar, 2);
    }

    public static ta.a u(int i11, RecyclerView recyclerView, DESyllableIntroductionActivity dESyllableIntroductionActivity) {
        recyclerView.setLayoutManager(new GridLayoutManager(i11));
        return dESyllableIntroductionActivity.j();
    }

    public static ta.a v(int i11, RecyclerView recyclerView, ESUSSyllableIntroductionActivity eSUSSyllableIntroductionActivity) {
        recyclerView.setLayoutManager(new GridLayoutManager(i11));
        return eSUSSyllableIntroductionActivity.j();
    }

    public static void w(int i11, f10.e eVar) {
        eVar.f(new np.b(i11));
    }

    public static void x(int i11, t1.d dVar, l1.s sVar, boolean z11) {
        dVar.invoke(sVar, Integer.valueOf(i11));
        sVar.p(z11);
    }

    public static void y(a9.i iVar, long j11, Long l9, Integer num) {
        kotlin.jvm.internal.m.c(iVar);
        iVar.v(fv.b.Y(j11, l9, num));
    }

    public static /* synthetic */ void z(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }
}
