package b7;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.p002firebaseauthapi.zzakb;
import com.google.android.gms.internal.play_billing.zzep;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.gson.JsonObject;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.data.model.CourseWord;
import dv.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e0 {
    public static void A(ur.a aVar, String str) {
        aVar.c(str, new m9(26));
    }

    public static int B(int i11, int i12, int i13) {
        return zzakb.x(i11) + i12 + i13;
    }

    public static int C(int i11, int i12, int i13) {
        return zzada.b(i11) + i12 + i13;
    }

    public static int D(int i11, int i12, int i13) {
        return zzep.b(i11) + i12 + i13;
    }

    public static int a(int i11, int i12, int i13) {
        int i14 = i11 / i12;
        return i14 + i14 + i13;
    }

    public static int b(int i11, int i12, int i13, int i14) {
        return zzada.b(i11) + i12 + i13 + i14;
    }

    public static int c(int i11, int i12, int i13, int i14, int i15) {
        return Math.max(((i11 * i12) / i13) + i14, i15);
    }

    public static int d(ij.l lVar, int i11) {
        kotlin.jvm.internal.m.c(lVar);
        return lVar.b(i11).getPronun();
    }

    public static Bundle e(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static DisplayMetrics f(LingoSkillApplication lingoSkillApplication) {
        kotlin.jvm.internal.m.c(lingoSkillApplication);
        return lingoSkillApplication.getResources().getDisplayMetrics();
    }

    public static zzaef g(zzaef zzaefVar) {
        int size = zzaefVar.size();
        return zzaefVar.zzg(size + size);
    }

    public static FieldDescriptor h(AtProtobuf atProtobuf, FieldDescriptor.Builder builder) {
        Protobuf protobufA = atProtobuf.a();
        if (builder.f19625b == null) {
            builder.f19625b = new HashMap();
        }
        builder.f19625b.put(protobufA.annotationType(), protobufA);
        return new FieldDescriptor(builder.f19624a, builder.f19625b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(builder.f19625b)));
    }

    public static hv.a i(u0 u0Var, JsonObject jsonObject, String str) {
        jsonObject.add(str, u0Var.c());
        return u0Var.a();
    }

    public static Object j(zzbk zzbkVar, int i11, ArrayList arrayList, int i12) {
        zzh.a(i11, zzbkVar.name(), arrayList);
        return arrayList.get(i12);
    }

    public static String k(long j11, String str, String str2) {
        return str + str2 + j11;
    }

    public static String l(CourseWord courseWord, String str) {
        String string = courseWord.getAudioUri().toString();
        kotlin.jvm.internal.m.e(string, str);
        return string;
    }

    public static String m(CourseWord courseWord, String str, String str2) {
        kotlin.jvm.internal.m.f(courseWord, str);
        String string = courseWord.getAudioUri().toString();
        kotlin.jvm.internal.m.e(string, str2);
        return string;
    }

    public static String n(StringBuilder sb2, List list, String str) {
        sb2.append(list);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder o(int i11, String str, String str2, long j11) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(j11);
        return sb2;
    }

    public static StringBuilder p(long j11, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder q(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static ArrayList r(String str, List list) {
        kotlin.jvm.internal.m.e(list, str);
        return new ArrayList();
    }

    public static LinkedHashMap s(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str, str2);
        return linkedHashMap;
    }

    public static List t(ListIterator listIterator, int i11, List list) {
        return ry.m.U0(list, listIterator.nextIndex() + i11);
    }

    public static Pattern u(int i11, String str, String str2, String str3, String str4) {
        Pattern patternCompile = Pattern.compile(str);
        kotlin.jvm.internal.m.e(patternCompile, str2);
        kotlin.jvm.internal.m.f(str3, str4);
        oz.q.U0(i11);
        return patternCompile;
    }

    public static void v(int i11, Bundle bundle, String str, String str2) {
        bundle.putString(str2, str + i11);
    }

    public static void w(long j11, String str, String str2, StringBuilder sb2) {
        sb2.append(j11);
        sb2.append(str);
        sb2.append(str2);
    }

    public static void x(long j11, ArrayList arrayList) {
        arrayList.add(new Long(j11));
    }

    public static void y(Context context, Class cls, i.c cVar) {
        cVar.a(new Intent(context, (Class<?>) cls));
    }

    public static void z(String str, String str2, StringBuilder sb2, boolean z11, boolean z12) {
        sb2.append(str);
        sb2.append(z11);
        sb2.append(str2);
        sb2.append(z12);
    }
}
