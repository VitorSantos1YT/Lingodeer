package w4;

import android.content.Context;
import androidx.preference.ListPreference;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b7.f0;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.ptskill.ui.syllable.PTSyllableIntroductionActivity;
import j0.c2;
import j0.e2;
import j0.i1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.s;
import qx.p;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static int a(int i11, String str) {
        return ff.h.w(str + i11);
    }

    public static int b(int i11, String str, String str2) {
        m.e(str, str2);
        return str.length() - i11;
    }

    public static e20.a c(s sVar, int i11, s sVar2, int i12) {
        sVar.d0(i11);
        e20.a aVarA = q10.b.a(sVar2);
        sVar.d0(i12);
        return aVarA;
    }

    public static NullPointerException d(Throwable th2, Throwable th3, String str, Throwable th4) {
        ef.e.E(th2);
        p.u(th3);
        NullPointerException nullPointerException = new NullPointerException(str);
        nullPointerException.initCause(th4);
        return nullPointerException;
    }

    public static Object e(Class cls, e20.a aVar, b20.a aVar2, a20.a aVar3, s sVar) {
        Object objA = aVar.a(aVar3, aVar2, z.a(cls));
        sVar.o0(objA);
        return objA;
    }

    public static String f(int i11, String str) {
        return i11 + str;
    }

    public static String g(String str, int i11, int i12, int i13) {
        return str.subSequence(i13, i11 + i12).toString();
    }

    public static String h(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static StringBuilder i(int i11, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i11);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder j(long j11, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder k(String str, int i11, String str2, int i12, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(i12);
        sb2.append(str3);
        return sb2;
    }

    public static ArrayList l(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return arrayList;
    }

    public static ArrayList m(String str, String str2) {
        m.f(str, str2);
        return new ArrayList();
    }

    public static LinkedHashSet n(LinkedHashMap linkedHashMap, String str, ca.i iVar) {
        linkedHashMap.put(str, iVar);
        return new LinkedHashSet();
    }

    public static ta.a o(int i11, RecyclerView recyclerView, PTSyllableIntroductionActivity pTSyllableIntroductionActivity) {
        recyclerView.setLayoutManager(new GridLayoutManager(i11));
        return pTSyllableIntroductionActivity.j();
    }

    public static r p(float f5, boolean z11, r rVar) {
        return rVar.i(new i1(f5, z11));
    }

    public static r q(o oVar, float f5, c2 c2Var, float f11, float f12) {
        return e2.g(c2Var.a(j0.c.A(oVar, f5), f11), f12);
    }

    public static void r(float f5, boolean z11, s sVar) {
        j0.c.g(sVar, new i1(f5, z11));
    }

    public static void s(int i11, int i12, int i13, int i14, int i15) {
        f0.G(i11);
        f0.G(i12);
        f0.G(i13);
        f0.G(i14);
        f0.G(i15);
    }

    public static void t(int i11, int i12, String str, String str2, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(i12);
    }

    public static void u(int i11, ListPreference listPreference) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        listPreference.J(sb2.toString());
    }

    public static void v(Context context, String str, int i11, BaseViewHolder baseViewHolder, int i12) {
        m.e(context, str);
        baseViewHolder.setTextColor(i12, context.getColor(i11));
    }

    public static void w(String str, long j11, String str2, ArrayList arrayList) {
        arrayList.add(new fv.a(j11, str, str2));
    }

    public static void x(String str, String str2, String str3, ArrayList arrayList) {
        arrayList.add(new fv.a(str, str2, str3));
    }
}
