package defpackage;

import androidx.fragment.app.k0;
import androidx.recyclerview.widget.RecyclerView;
import b7.a;
import java.util.HashMap;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.h1;
import l1.s;
import v10.d;
import y2.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static void A(int i11, s sVar, int i12, h hVar) {
        sVar.o0(Integer.valueOf(i11));
        sVar.b(Integer.valueOf(i12), hVar);
    }

    public static void B(String str, String str2) {
        a.B(str + str2);
    }

    public static void C(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static int D(int i11, int i12, int i13, int i14) {
        return ((i11 * i12) / i13) + i14;
    }

    public static int a(int i11, float f5, int i12) {
        return (Float.hashCode(f5) + i11) * i12;
    }

    public static int b(int i11, int i12, int i13) {
        return (Integer.hashCode(i11) + i12) * i13;
    }

    public static int c(int i11, int i12, int i13, int i14) {
        return ((i11 / i12) * i13) + i14;
    }

    public static int d(int i11, int i12, String str) {
        return (str.hashCode() + i11) * i12;
    }

    public static int e(int i11, int i12, boolean z11) {
        return (Boolean.hashCode(z11) + i11) * i12;
    }

    public static int f(long j11, int i11, int i12) {
        return (Long.hashCode(j11) + i11) * i12;
    }

    public static String g(int i11, String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i11);
        return sb2.toString();
    }

    public static String h(long j11, String str) {
        return str + j11;
    }

    public static String i(long j11, String str, StringBuilder sb2) {
        sb2.append(j11);
        sb2.append(str);
        return sb2.toString();
    }

    public static String j(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.exceptionLabel());
        return sb2.toString();
    }

    public static String k(Class cls, StringBuilder sb2, char c11) {
        sb2.append(f20.a.a(z.a(cls)));
        sb2.append(c11);
        return sb2.toString();
    }

    public static String l(String str, k0 k0Var, String str2) {
        return str + k0Var + str2;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String n(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String o(StringBuilder sb2, float f5, char c11) {
        sb2.append(f5);
        sb2.append(c11);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static StringBuilder q(int i11, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(i11);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder r(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder s(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static KotlinNothingValueException t(String str) {
        v2.a.c(str);
        return new KotlinNothingValueException();
    }

    public static kotlin.jvm.internal.e u(e20.a aVar, String str, a20.a aVar2, String str2, Class cls) {
        m.f(aVar, str);
        m.f(aVar2, str2);
        return z.a(cls);
    }

    public static h1 v(int i11, s sVar) {
        h1 h1Var = new h1(i11);
        sVar.o0(h1Var);
        return h1Var;
    }

    public static v10.a w(u10.a aVar, x10.a aVar2) {
        v10.a aVar3 = new v10.a(aVar);
        aVar2.a(aVar3);
        return aVar3;
    }

    public static d x(u10.a aVar, x10.a aVar2) {
        d dVar = new d(aVar);
        aVar2.a(dVar);
        return dVar;
    }

    public static void y(int i11, String str) {
        a.B(str + i11);
    }

    public static void z(int i11, HashMap map, String str, int i12, String str2) {
        map.put(str, Integer.valueOf(i11));
        map.put(str2, Integer.valueOf(i12));
    }
}
