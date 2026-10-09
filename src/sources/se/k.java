package se;

import aj.uZCn.evRpcb;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import androidx.lifecycle.LifecycleOwner;
import ay.i0;
import bp.f4;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import f.d0;
import f.e0;
import f.f0;
import fr.o0;
import g2.y0;
import hh.p0;
import j3.u0;
import j3.x0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import l1.b1;
import l1.c0;
import l1.x1;
import l2.g0;
import l2.h0;
import l2.j0;
import l2.k0;
import mt.b6;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final synchronized void A(g eventsToPersist) {
        if (qf.a.b(k.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.m.f(eventsToPersist, "eventsToPersist");
            x xVarB = i.B();
            for (b bVar : eventsToPersist.f()) {
                y yVarB = eventsToPersist.b(bVar);
                if (yVarB == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                xVarB.a(bVar, yVarB.b());
            }
            i.E(xVarB);
        } catch (Throwable th2) {
            qf.a.a(k.class, th2);
        }
    }

    public static final CourseWord C(List list) {
        Object next;
        kotlin.jvm.internal.m.f(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            CourseWord courseWord = (CourseWord) next;
            if (courseWord.getSelectedState() == OptionItemSelectedState.SELECTED || courseWord.getSelectedState() == OptionItemSelectedState.WRONG) {
                return (CourseWord) next;
            }
        }
        next = null;
        return (CourseWord) next;
    }

    public static final long D(String character) {
        kotlin.jvm.internal.m.f(character, "character");
        return Math.abs(character.hashCode()) + 9000000000L;
    }

    public static boolean E(qx.i iVar, qx.k kVar, tx.d dVar) {
        if (!(iVar instanceof tx.f)) {
            return false;
        }
        try {
            Object obj = ((tx.f) iVar).get();
            if (obj == null) {
                ux.c.c(kVar);
                return true;
            }
            try {
                Object objApply = dVar.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                qx.i iVar2 = (qx.i) objApply;
                if (!(iVar2 instanceof tx.f)) {
                    ((qx.h) iVar2).i(kVar);
                    return true;
                }
                try {
                    Object obj2 = ((tx.f) iVar2).get();
                    if (obj2 == null) {
                        ux.c.c(kVar);
                        return true;
                    }
                    i0 i0Var = new i0(kVar, obj2);
                    kVar.c(i0Var);
                    i0Var.run();
                    return true;
                } catch (Throwable th2) {
                    ef.e.E(th2);
                    ux.c.e(th2, kVar);
                    return true;
                }
            } catch (Throwable th3) {
                ef.e.E(th3);
                ux.c.e(th3, kVar);
                return true;
            }
        } catch (Throwable th4) {
            ef.e.E(th4);
            ux.c.e(th4, kVar);
            return true;
        }
    }

    public static k2.a a(g2.h hVar, int i11) {
        Bitmap bitmap = hVar.f28568a;
        k2.a aVar = new k2.a(hVar, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        aVar.H = i11;
        return aVar;
    }

    public static final void b(tg.i0 i0Var, String str, l1.n nVar, int i11) {
        tg.i0 i0Var2;
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-166034923);
        int i12 = (sVar.f(i0Var) ? 4 : 2) | i11 | (sVar.f(str) ? 32 : 16);
        if ((i12 & 19) == 18 && sVar.F()) {
            sVar.W();
            i0Var2 = i0Var;
        } else {
            sVar.d0(115231289);
            boolean z11 = (i12 & 112) == 32;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                j3.e eVar = new j3.e(16);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                new gh.g(str, 3).invoke(eVar);
                objQ = new vg.m(eVar.j(), ry.x.h0(linkedHashMap));
                sVar.o0(objQ);
            }
            sVar.p(false);
            i0Var2 = i0Var;
            c.a.c(i0Var2, (vg.m) objQ, null, null, false, 0, 0, sVar, i12 & 14, 62);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new pr.y(i0Var2, i11, 6, str);
        }
    }

    public static final void c(boolean z11, fz.e eVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-642000585);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(eVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            b1 b1VarH = l1.t.H(eVar, sVar);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                c0 c0Var = new c0(l1.t.q(sVar));
                sVar.o0(c0Var);
                objQ = c0Var;
            }
            b0 b0Var = ((c0) objQ).f39245a;
            Object objQ2 = sVar.Q();
            Object obj = objQ2;
            if (objQ2 == gVar) {
                fz.e eVar2 = (fz.e) b1VarH.getValue();
                g.l lVar = new g.l(z11);
                lVar.f28309d = b0Var;
                lVar.f28310e = eVar2;
                sVar.o0(lVar);
                obj = lVar;
            }
            g.l lVar2 = (g.l) obj;
            boolean zF = sVar.f((fz.e) b1VarH.getValue()) | sVar.f(b0Var);
            Object objQ3 = sVar.Q();
            if (zF || objQ3 == gVar) {
                lVar2.f28310e = (fz.e) b1VarH.getValue();
                lVar2.f28309d = b0Var;
                sVar.o0(qy.b0.f48488a);
            }
            Boolean boolValueOf = Boolean.valueOf(z11);
            boolean zH = ((i12 & 14) == 4) | sVar.h(lVar2);
            Object objQ4 = sVar.Q();
            if (zH || objQ4 == gVar) {
                objQ4 = new g.m(lVar2, z11, null);
                sVar.o0(objQ4);
            }
            l1.t.f((fz.e) objQ4, boolValueOf, sVar);
            f0 f0VarA = g.i.a(sVar);
            if (f0VarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            d0 onBackPressedDispatcher = f0VarA.getOnBackPressedDispatcher();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) sVar.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zH2 = sVar.h(onBackPressedDispatcher) | sVar.h(lifecycleOwner) | sVar.h(lVar2);
            Object objQ5 = sVar.Q();
            if (zH2 || objQ5 == gVar) {
                objQ5 = new a0.j(onBackPressedDispatcher, lifecycleOwner, lVar2, 6);
                sVar.o0(objQ5);
            }
            l1.t.d(lifecycleOwner, onBackPressedDispatcher, (fz.c) objQ5, sVar);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g.n(z11, eVar, i11);
        }
    }

    public static final d1.w d(ie.o oVar, d1.i iVar) {
        d1.j jVarE = oVar.e();
        d1.t tVar = (d1.t) oVar.f34407d;
        boolean z11 = jVarE == d1.j.CROSSED;
        return new d1.w(h(tVar, z11, true, iVar), h(tVar, z11, false, iVar), z11);
    }

    public static final oz.l e(Matcher matcher, int i11, CharSequence charSequence) {
        if (matcher.find(i11)) {
            return new oz.l(matcher, charSequence);
        }
        return null;
    }

    public static final d1.v f(ie.o oVar, d1.t tVar, d1.v vVar) {
        d1.j jVar;
        int i11 = tVar.f22992c;
        int i12 = tVar.f22991b;
        boolean z11 = oVar.f34405b;
        int i13 = z11 ? i12 : i11;
        u0 u0Var = (u0) tVar.f22994e;
        int i14 = tVar.f22993d;
        qy.j jVar2 = qy.j.NONE;
        qy.h hVarU = com.bumptech.glide.d.u(jVar2, new f4(tVar, i13, 1));
        qy.h hVarU2 = com.bumptech.glide.d.u(jVar2, new d1.y(tVar, i13, z11 ? i11 : i12, oVar, hVarU));
        if (1 != vVar.f23001c) {
            return (d1.v) hVarU2.getValue();
        }
        if (i13 == i14) {
            return vVar;
        }
        if (((Number) hVarU.getValue()).intValue() != u0Var.f35798b.d(i14)) {
            return (d1.v) hVarU2.getValue();
        }
        int i15 = vVar.f23000b;
        long j11 = u0Var.j(i15);
        if (i14 != -1) {
            if (i13 != i14) {
                if (i12 < i11) {
                    jVar = d1.j.NOT_CROSSED;
                } else {
                    jVar = i12 > i11 ? d1.j.CROSSED : d1.j.COLLAPSED;
                }
                if (((z11 ? 1 : 0) ^ (jVar != d1.j.CROSSED ? 0 : 1)) == 0) {
                }
            }
            return tVar.b(i13);
        }
        int i16 = x0.f35822c;
        return (i15 == ((int) (j11 >> 32)) || i15 == ((int) (j11 & 4294967295L))) ? (d1.v) hVarU2.getValue() : tVar.b(i13);
    }

    public static void g(d0 d0Var, f.o oVar, fz.c cVar) {
        kotlin.jvm.internal.m.f(d0Var, "<this>");
        d0Var.a(oVar, new e0(cVar));
    }

    public static final d1.v h(d1.t tVar, boolean z11, boolean z12, d1.i iVar) {
        long j11;
        long jA = iVar.a(tVar, z12 ? tVar.f22991b : tVar.f22992c);
        if (z11 ^ z12) {
            int i11 = x0.f35822c;
            j11 = jA >> 32;
        } else {
            int i12 = x0.f35822c;
            j11 = 4294967295L & jA;
        }
        return tVar.b((int) j11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(tz.t tVar, fz.a aVar, vy.d dVar) {
        tz.r rVar;
        if (dVar instanceof tz.r) {
            rVar = (tz.r) dVar;
            int i11 = rVar.f52712c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.f52712c = i11 - Integer.MIN_VALUE;
            } else {
                rVar = new tz.r(dVar);
            }
        } else {
            rVar = new tz.r(dVar);
        }
        Object obj = rVar.f52711b;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = rVar.f52712c;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                if (rVar.getContext().get(rz.z.f50978b) != tVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                rVar.f52710a = aVar;
                rVar.f52712c = 1;
                rz.m mVar = new rz.m(1, ue.f.x(rVar));
                mVar.s();
                ((tz.s) tVar).b0(new av.t(mVar, 12));
                if (mVar.r() == aVar2) {
                    return aVar2;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = rVar.f52710a;
                com.bumptech.glide.e.F(obj);
            }
            aVar.invoke();
            return qy.b0.f48488a;
        } catch (Throwable th2) {
            aVar.invoke();
            throw th2;
        }
    }

    public static final ns.z j(ht.o courseTestParams, String str, String sourceMeaning, String correctAnswer, String userAnswer) {
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(sourceMeaning, "sourceMeaning");
        kotlin.jvm.internal.m.f(correctAnswer, "correctAnswer");
        kotlin.jvm.internal.m.f(userAnswer, "userAnswer");
        o0 o0Var = (o0) xt.b.c();
        return new ns.z(courseTestParams.f33756d, xt.d.n(o0Var.f27733a.locateLanguage), xt.d.n(o0Var.f27733a.keyLanguage), str, sourceMeaning, correctAnswer, userAnswer);
    }

    public static final d1.v k(d1.v vVar, d1.t tVar, int i11) {
        return new d1.v(((u0) tVar.f22994e).a(i11), i11, vVar.f23001c);
    }

    public static String m(Object value, String str) {
        kotlin.jvm.internal.m.f(value, "value");
        return str + " value: " + value;
    }

    public static int n(CharSequence charSequence, int i11) {
        boolean z11 = false;
        int i12 = 0;
        int i13 = 0;
        i11 = -1;
        int i14 = 0;
        while (i11 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != ',') {
                if (cCharAt == '[') {
                    i12++;
                } else {
                    if (cCharAt != ']') {
                        if (cCharAt != '`') {
                            if (cCharAt == '{') {
                                i13++;
                            } else if (cCharAt == '}') {
                                i13--;
                                if (i13 >= 0) {
                                }
                            } else if (cCharAt != 8239 && cCharAt != 8287 && cCharAt != 12288) {
                                if (cCharAt == '.') {
                                    continue;
                                } else if (cCharAt != '/') {
                                    if (cCharAt != '>') {
                                        if (cCharAt == '?') {
                                            continue;
                                        } else if (cCharAt != 8232 && cCharAt != 8233) {
                                            switch (cCharAt) {
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case '\b':
                                                case '\t':
                                                case '\n':
                                                case 11:
                                                case '\f':
                                                case '\r':
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case Service.METRICS_FIELD_NUMBER /* 24 */:
                                                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                                                case Service.BILLING_FIELD_NUMBER /* 26 */:
                                                case 27:
                                                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                                                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                                case 30:
                                                case 31:
                                                case Consts.SP /* 32 */:
                                                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                                    break;
                                                case '!':
                                                    continue;
                                                default:
                                                    switch (cCharAt) {
                                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                            boolean z12 = !z11;
                                                            if (z11) {
                                                                i11 = i11;
                                                            }
                                                            z11 = z12;
                                                            continue;
                                                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                                            i14++;
                                                            continue;
                                                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                                            i14--;
                                                            if (i14 < 0) {
                                                            }
                                                            break;
                                                        default:
                                                            switch (cCharAt) {
                                                                case ':':
                                                                case ';':
                                                                    continue;
                                                                case '<':
                                                                    break;
                                                                default:
                                                                    switch (cCharAt) {
                                                                        case 127:
                                                                        case 128:
                                                                        case 129:
                                                                        case 130:
                                                                        case 131:
                                                                        case 132:
                                                                        case 133:
                                                                        case 134:
                                                                        case 135:
                                                                        case 136:
                                                                        case 137:
                                                                        case 138:
                                                                        case 139:
                                                                        case 140:
                                                                        case 141:
                                                                        case 142:
                                                                        case 143:
                                                                        case 144:
                                                                        case 145:
                                                                        case 146:
                                                                        case 147:
                                                                        case 148:
                                                                        case 149:
                                                                        case 150:
                                                                        case 151:
                                                                        case 152:
                                                                        case 153:
                                                                        case 154:
                                                                        case 155:
                                                                        case 156:
                                                                        case 157:
                                                                        case 158:
                                                                        case 159:
                                                                        case 160:
                                                                            break;
                                                                        default:
                                                                            switch (cCharAt) {
                                                                                case OSSConstants.DEFAULT_BUFFER_SIZE /* 8192 */:
                                                                                case 8193:
                                                                                case 8194:
                                                                                case 8195:
                                                                                case 8196:
                                                                                case 8197:
                                                                                case 8198:
                                                                                case 8199:
                                                                                case 8200:
                                                                                case 8201:
                                                                                case 8202:
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                } else if (i11 == i11 - 1) {
                                }
                            }
                        }
                        return i11;
                    }
                    i12--;
                    if (i12 < 0) {
                        return i11;
                    }
                }
            }
            i11++;
        }
        return i11;
    }

    public static a9.i o() {
        a9.i iVar = t10.a.f52009b;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    public static pd.e p(pd.h hVar, List list) {
        pd.a cacheEntry = hVar.getCacheEntry();
        if (cacheEntry == null) {
            return new pd.e(null, true, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((pd.c) it.next()).f46776a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = cacheEntry.f46768h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (pd.c cVar : cacheEntry.f46768h) {
                    if (!treeSet.contains(cVar.f46776a)) {
                        arrayList.add(cVar);
                    }
                }
            }
        } else if (!cacheEntry.f46767g.isEmpty()) {
            for (Map.Entry entry : cacheEntry.f46767g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new pd.c((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new pd.e(cacheEntry.f46761a, true, arrayList);
    }

    public static final boolean q(j3.h hVar) {
        int length = hVar.f35700b.length();
        List list = hVar.f35699a;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j3.f fVar = (j3.f) list.get(i11);
                if ((fVar.f35689a instanceof j3.w) && j3.i.b(0, length, fVar.f35690b, fVar.f35691c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] r(InputStream inputStream, int i11, qd.a aVar) throws Throwable {
        byte[] bArrA;
        qd.f fVar = new qd.f(aVar, i11);
        try {
            bArrA = aVar.a(1024);
            while (true) {
                try {
                    int i12 = inputStream.read(bArrA);
                    if (i12 == -1) {
                        break;
                    }
                    fVar.write(bArrA, 0, i12);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        pd.p.b("Error occurred when closing InputStream", new Object[0]);
                    }
                    aVar.b(bArrA);
                    fVar.close();
                    throw th;
                }
            }
            byte[] byteArray = fVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                pd.p.b("Error occurred when closing InputStream", new Object[0]);
            }
            aVar.b(bArrA);
            fVar.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArrA = null;
        }
    }

    public static boolean s(String str) {
        wa.h hVar = wa.j.f54892a;
        Set<wa.d> setUnmodifiableSet = Collections.unmodifiableSet(wa.c.f54885c);
        HashSet hashSet = new HashSet();
        for (wa.d dVar : setUnmodifiableSet) {
            if (((wa.c) dVar).f54886a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            wa.c cVar = (wa.c) ((wa.d) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static final String t(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ry.m.d0(arrayList, ((CourseWord) it.next()).getDisplayCharWords());
        }
        return ry.m.y0(arrayList, BuildConfig.VERSION_NAME, null, null, new b6(13), 30);
    }

    public static final String u(String str, List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        return oz.q.i1(ry.m.y0(list, str, null, null, new b6(12), 30)).toString();
    }

    public static ij.i v() {
        if (ij.i.f34434b == null) {
            synchronized (ij.i.class) {
                if (ij.i.f34434b == null) {
                    ij.i.f34434b = new ij.i();
                }
            }
        }
        ij.i iVar = ij.i.f34434b;
        kotlin.jvm.internal.m.c(iVar);
        return iVar;
    }

    public static wh.a w() {
        if (wh.a.f55170d == null) {
            synchronized (wh.a.class) {
                if (wh.a.f55170d == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    wh.a.f55170d = new wh.a(lingoSkillApplication);
                }
            }
        }
        wh.a aVar = wh.a.f55170d;
        kotlin.jvm.internal.m.c(aVar);
        return aVar;
    }

    public static final String x(String audioKey) {
        kotlin.jvm.internal.m.f(audioKey, "audioKey");
        String strQ0 = oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.q.i1(audioKey).toString(), " ", "_"), "ā", "a"), "ī", "i"), "ū", "u"), "ē", "e"), "ō", "o");
        return (strQ0.equals("wo") || strQ0.equals("(w)o")) ? "o" : strQ0;
    }

    public static final synchronized void z(b bVar, y yVar) {
        if (qf.a.b(k.class)) {
            return;
        }
        try {
            x xVarB = i.B();
            xVarB.a(bVar, yVar.b());
            i.E(xVarB);
        } catch (Throwable th2) {
            qf.a.a(k.class, th2);
        }
    }

    public abstract k B(String str, fz.c cVar);

    public abstract Object l();

    /* JADX WARN: Code duplicated, block: B:126:0x036a  */
    /* JADX WARN: Code duplicated, block: B:145:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:146:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:152:0x040c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x040e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0416  */
    /* JADX WARN: Code duplicated, block: B:161:0x0431 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0433  */
    /* JADX WARN: Code duplicated, block: B:164:0x043b  */
    /* JADX WARN: Code duplicated, block: B:167:0x044b  */
    /* JADX WARN: Code duplicated, block: B:168:0x044e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0454  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    public static final k2.b y(int i11, l1.n nVar, int i12) {
        TypedValue typedValue;
        int i13;
        long jC;
        int i14;
        int i15;
        int i16;
        char c11;
        int i17;
        List list;
        List list2;
        int i18;
        int i19;
        int i21;
        ij.d dVarD;
        int i22;
        Shader shader;
        g2.t y0Var;
        Shader shader2;
        g2.t y0Var2;
        g2.t tVar;
        int i23;
        l1.s sVar = (l1.s) nVar;
        Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
        Resources resources = (Resources) sVar.j(AndroidCompositionLocals_androidKt.f1201c);
        e3.d dVar = (e3.d) sVar.j(AndroidCompositionLocals_androidKt.f1203e);
        synchronized (dVar) {
            typedValue = (TypedValue) dVar.f24777a.b(i11);
            i13 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i11, typedValue, true);
                y.x xVar = dVar.f24777a;
                int iD = xVar.d(i11);
                Object[] objArr = xVar.f56738c;
                Object obj = objArr[iD];
                xVar.f56737b[iD] = i11;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !oz.q.B0(charSequence, ".xml")) {
            sVar.d0(-1771643000);
            boolean zF = sVar.f(context.getTheme()) | sVar.f(charSequence) | ((((i12 & 14) ^ 6) > 4 && sVar.d(i11)) || (i12 & 6) == 4);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                try {
                    Drawable drawable = resources.getDrawable(i11, null);
                    kotlin.jvm.internal.m.d(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objQ = new g2.h(((BitmapDrawable) drawable).getBitmap());
                    sVar.o0(objQ);
                } catch (Exception e8) {
                    throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e8);
                }
            }
            g2.h hVar = (g2.h) objQ;
            k2.a aVar = new k2.a(hVar, (((long) hVar.f28568a.getHeight()) & 4294967295L) | (((long) hVar.f28568a.getWidth()) << 32));
            sVar.p(false);
            return aVar;
        }
        sVar.d0(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i24 = typedValue.changingConfigurations;
        e3.c cVar = (e3.c) sVar.j(AndroidCompositionLocals_androidKt.f1202d);
        e3.b bVar = new e3.b(theme, i11);
        WeakReference weakReference = (WeakReference) cVar.f24776a.get(bVar);
        e3.a aVar2 = weakReference != null ? (e3.a) weakReference.get() : null;
        if (aVar2 == null) {
            XmlResourceParser xml = resources.getXml(i11);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!kotlin.jvm.internal.m.a(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            m2.a aVar3 = new m2.a(xml);
            TypedArray typedArrayH = q4.a.h(resources, theme, attributeSetAsAttributeSet, m2.b.f40824a);
            aVar3.b(typedArrayH.getChangingConfigurations());
            boolean z11 = !q4.a.e(xml, "autoMirrored") ? false : typedArrayH.getBoolean(5, false);
            aVar3.b(typedArrayH.getChangingConfigurations());
            float fA = aVar3.a(typedArrayH, "viewportWidth", 7, CropImageView.DEFAULT_ASPECT_RATIO);
            float fA2 = aVar3.a(typedArrayH, "viewportHeight", 8, CropImageView.DEFAULT_ASPECT_RATIO);
            if (fA <= CropImageView.DEFAULT_ASPECT_RATIO) {
                throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fA2 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            int i25 = 3;
            float dimension = typedArrayH.getDimension(3, CropImageView.DEFAULT_ASPECT_RATIO);
            aVar3.b(typedArrayH.getChangingConfigurations());
            float dimension2 = typedArrayH.getDimension(2, CropImageView.DEFAULT_ASPECT_RATIO);
            aVar3.b(typedArrayH.getChangingConfigurations());
            if (typedArrayH.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayH.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jC = g2.x.f28622i;
                } else {
                    ColorStateList colorStateListC = q4.a.c(typedArrayH, xml, theme);
                    aVar3.b(typedArrayH.getChangingConfigurations());
                    jC = colorStateListC != null ? g2.f0.c(colorStateListC.getDefaultColor()) : g2.x.f28622i;
                }
            } else {
                jC = g2.x.f28622i;
            }
            long j11 = jC;
            int i26 = typedArrayH.getInt(6, -1);
            aVar3.b(typedArrayH.getChangingConfigurations());
            if (i26 == -1) {
                i14 = 5;
            } else if (i26 == 3) {
                i14 = 3;
            } else if (i26 == 5) {
                i14 = 5;
            } else if (i26 != 9) {
                switch (i26) {
                    case 14:
                        i14 = 13;
                        break;
                    case 15:
                        i14 = 14;
                        break;
                    case 16:
                        i14 = 12;
                        break;
                    default:
                        i14 = 5;
                        break;
                }
            } else {
                i14 = 9;
            }
            float f5 = dimension / resources.getDisplayMetrics().density;
            float f11 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayH.recycle();
            l2.d dVar2 = new l2.d(null, f5, f11, fA, fA2, j11, i14, z11, 1);
            int i27 = 0;
            while (xml.getEventType() != i13 && (xml.getDepth() >= i13 || xml.getEventType() != i25)) {
                ry.r rVar = ry.r.f50854a;
                XmlPullParser xmlPullParser = aVar3.f40821a;
                ob.e eVar = aVar3.f40823c;
                XmlResourceParser xmlResourceParser = xml;
                int eventType = xmlPullParser.getEventType();
                int i28 = i24;
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            i15 = i27;
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    TypedArray typedArrayH2 = q4.a.h(resources, theme, attributeSetAsAttributeSet, m2.b.f40825b);
                                    aVar3.b(typedArrayH2.getChangingConfigurations());
                                    float fA3 = aVar3.a(typedArrayH2, "rotation", 5, CropImageView.DEFAULT_ASPECT_RATIO);
                                    float f12 = typedArrayH2.getFloat(1, CropImageView.DEFAULT_ASPECT_RATIO);
                                    aVar3.b(typedArrayH2.getChangingConfigurations());
                                    float f13 = typedArrayH2.getFloat(2, CropImageView.DEFAULT_ASPECT_RATIO);
                                    aVar3.b(typedArrayH2.getChangingConfigurations());
                                    float fA4 = aVar3.a(typedArrayH2, "scaleX", 3, 1.0f);
                                    float fA5 = aVar3.a(typedArrayH2, "scaleY", 4, 1.0f);
                                    float fA6 = aVar3.a(typedArrayH2, evRpcb.tBR, 6, CropImageView.DEFAULT_ASPECT_RATIO);
                                    float fA7 = aVar3.a(typedArrayH2, "translateY", 7, CropImageView.DEFAULT_ASPECT_RATIO);
                                    String string = typedArrayH2.getString(0);
                                    aVar3.b(typedArrayH2.getChangingConfigurations());
                                    String str = string == null ? BuildConfig.VERSION_NAME : string;
                                    typedArrayH2.recycle();
                                    int i29 = h0.f39633a;
                                    if (dVar2.f39574k) {
                                        v2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    dVar2.f39572i.add(new l2.c(str, fA3, f12, f13, fA4, fA5, fA6, fA7, rVar, 512));
                                    i27 = i15;
                                    i16 = 1;
                                    c11 = '\t';
                                    i17 = 3;
                                }
                            } else if (name.equals("path")) {
                                TypedArray typedArrayH3 = q4.a.h(resources, theme, attributeSetAsAttributeSet, m2.b.f40826c);
                                aVar3.b(typedArrayH3.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    throw new IllegalArgumentException("No path data available");
                                }
                                String string2 = typedArrayH3.getString(0);
                                aVar3.b(typedArrayH3.getChangingConfigurations());
                                String str2 = string2 == null ? BuildConfig.VERSION_NAME : string2;
                                String string3 = typedArrayH3.getString(2);
                                aVar3.b(typedArrayH3.getChangingConfigurations());
                                if (string3 == null) {
                                    int i30 = h0.f39633a;
                                    list2 = rVar;
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    eVar.u(arrayList, string3);
                                    list2 = arrayList;
                                }
                                ij.d dVarD2 = q4.a.d(typedArrayH3, aVar3.f40821a, theme, "fillColor", 1);
                                aVar3.b(typedArrayH3.getChangingConfigurations());
                                float fA8 = aVar3.a(typedArrayH3, "fillAlpha", 12, 1.0f);
                                int i31 = !q4.a.e(aVar3.f40821a, "strokeLineCap") ? -1 : typedArrayH3.getInt(8, -1);
                                aVar3.b(typedArrayH3.getChangingConfigurations());
                                if (i31 == 0) {
                                    i18 = 0;
                                } else if (i31 == 1) {
                                    i18 = 1;
                                } else if (i31 != 2) {
                                    i18 = 0;
                                } else {
                                    i18 = 2;
                                }
                                if (q4.a.e(aVar3.f40821a, "strokeLineJoin")) {
                                    c11 = '\t';
                                    i19 = typedArrayH3.getInt(9, -1);
                                } else {
                                    c11 = '\t';
                                    i19 = -1;
                                }
                                aVar3.b(typedArrayH3.getChangingConfigurations());
                                if (i19 != 0) {
                                    if (i19 == 1) {
                                        i21 = 1;
                                    } else if (i19 == 2) {
                                        i21 = 2;
                                    }
                                    float fA9 = aVar3.a(typedArrayH3, "strokeMiterLimit", 10, 4.0f);
                                    dVarD = q4.a.d(typedArrayH3, aVar3.f40821a, theme, "strokeColor", 3);
                                    aVar3.b(typedArrayH3.getChangingConfigurations());
                                    float fA10 = aVar3.a(typedArrayH3, "strokeAlpha", 11, 1.0f);
                                    float fA11 = aVar3.a(typedArrayH3, "strokeWidth", 4, 1.0f);
                                    float fA12 = aVar3.a(typedArrayH3, "trimPathEnd", 6, 1.0f);
                                    float fA13 = aVar3.a(typedArrayH3, "trimPathOffset", 7, CropImageView.DEFAULT_ASPECT_RATIO);
                                    float fA14 = aVar3.a(typedArrayH3, "trimPathStart", 5, CropImageView.DEFAULT_ASPECT_RATIO);
                                    if (q4.a.e(aVar3.f40821a, "fillType")) {
                                        i22 = typedArrayH3.getInt(13, 0);
                                    } else {
                                        i22 = 0;
                                    }
                                    aVar3.b(typedArrayH3.getChangingConfigurations());
                                    typedArrayH3.recycle();
                                    shader = (Shader) dVarD2.f34422c;
                                    if (shader == null && dVarD2.f34421b == 0) {
                                        y0Var = null;
                                    } else if (shader != null) {
                                        y0Var = new g2.u(shader);
                                    } else {
                                        y0Var = new y0(g2.f0.c(dVarD2.f34421b));
                                    }
                                    shader2 = (Shader) dVarD.f34422c;
                                    if (shader2 != null && dVarD.f34421b == 0) {
                                        tVar = null;
                                    } else {
                                        if (shader2 != null) {
                                            y0Var2 = new g2.u(shader2);
                                        } else {
                                            y0Var2 = new y0(g2.f0.c(dVarD.f34421b));
                                        }
                                        tVar = y0Var2;
                                    }
                                    if (i22 == 0) {
                                        i23 = 0;
                                    } else {
                                        i23 = 1;
                                    }
                                    if (dVar2.f39574k) {
                                        v2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ((l2.c) nv.p.f(1, dVar2.f39572i)).f39562j.add(new k0(str2, list2, i23, y0Var, fA8, tVar, fA10, fA11, i18, i21, fA9, fA14, fA12, fA13));
                                    i17 = 3;
                                    i27 = i15;
                                    i16 = 1;
                                }
                                i21 = 0;
                                float fA15 = aVar3.a(typedArrayH3, "strokeMiterLimit", 10, 4.0f);
                                dVarD = q4.a.d(typedArrayH3, aVar3.f40821a, theme, "strokeColor", 3);
                                aVar3.b(typedArrayH3.getChangingConfigurations());
                                float fA16 = aVar3.a(typedArrayH3, "strokeAlpha", 11, 1.0f);
                                float fA17 = aVar3.a(typedArrayH3, "strokeWidth", 4, 1.0f);
                                float fA18 = aVar3.a(typedArrayH3, "trimPathEnd", 6, 1.0f);
                                float fA19 = aVar3.a(typedArrayH3, "trimPathOffset", 7, CropImageView.DEFAULT_ASPECT_RATIO);
                                float fA110 = aVar3.a(typedArrayH3, "trimPathStart", 5, CropImageView.DEFAULT_ASPECT_RATIO);
                                if (q4.a.e(aVar3.f40821a, "fillType")) {
                                    i22 = 0;
                                } else {
                                    i22 = typedArrayH3.getInt(13, 0);
                                }
                                aVar3.b(typedArrayH3.getChangingConfigurations());
                                typedArrayH3.recycle();
                                shader = (Shader) dVarD2.f34422c;
                                if (shader == null) {
                                    y0Var = null;
                                } else if (shader != null) {
                                    y0Var = new g2.u(shader);
                                } else {
                                    y0Var = new y0(g2.f0.c(dVarD2.f34421b));
                                }
                                shader2 = (Shader) dVarD.f34422c;
                                if (shader2 != null) {
                                    if (shader2 != null) {
                                        y0Var2 = new g2.u(shader2);
                                    } else {
                                        y0Var2 = new y0(g2.f0.c(dVarD.f34421b));
                                    }
                                    tVar = y0Var2;
                                } else {
                                    tVar = null;
                                }
                                if (i22 == 0) {
                                    i23 = 0;
                                } else {
                                    i23 = 1;
                                }
                                if (dVar2.f39574k) {
                                    v2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ((l2.c) nv.p.f(1, dVar2.f39572i)).f39562j.add(new k0(str2, list2, i23, y0Var, fA8, tVar, fA16, fA17, i18, i21, fA15, fA110, fA18, fA19));
                                i17 = 3;
                                i27 = i15;
                                i16 = 1;
                            }
                        } else {
                            i15 = i27;
                            c11 = '\t';
                            i17 = 3;
                            if (name.equals("clip-path")) {
                                TypedArray typedArrayH4 = q4.a.h(resources, theme, attributeSetAsAttributeSet, m2.b.f40827d);
                                aVar3.b(typedArrayH4.getChangingConfigurations());
                                String string4 = typedArrayH4.getString(0);
                                aVar3.b(typedArrayH4.getChangingConfigurations());
                                String str3 = string4 == null ? BuildConfig.VERSION_NAME : string4;
                                i16 = 1;
                                String string5 = typedArrayH4.getString(1);
                                aVar3.b(typedArrayH4.getChangingConfigurations());
                                if (string5 == null) {
                                    int i32 = h0.f39633a;
                                    list = rVar;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    eVar.u(arrayList2, string5);
                                    list = arrayList2;
                                }
                                typedArrayH4.recycle();
                                if (dVar2.f39574k) {
                                    v2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                dVar2.f39572i.add(new l2.c(str3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, list, 512));
                                i27 = i15 + 1;
                            } else {
                                i16 = 1;
                                i27 = i15;
                            }
                        }
                    } else {
                        i15 = i27;
                    }
                    i16 = 1;
                    c11 = '\t';
                    i17 = 3;
                    i27 = i15;
                } else if (eventType == i25 && "group".equals(xmlPullParser.getName())) {
                    int i33 = i27 + 1;
                    int i34 = 0;
                    while (i34 < i33) {
                        ArrayList arrayList3 = dVar2.f39572i;
                        if (dVar2.f39574k) {
                            v2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                        }
                        l2.c cVar2 = (l2.c) p0.f(1, arrayList3);
                        ((l2.c) nv.p.f(1, arrayList3)).f39562j.add(new g0(cVar2.f39553a, cVar2.f39554b, cVar2.f39555c, cVar2.f39556d, cVar2.f39557e, cVar2.f39558f, cVar2.f39559g, cVar2.f39560h, cVar2.f39561i, cVar2.f39562j));
                        i34++;
                        i25 = 3;
                    }
                    i17 = i25;
                    i16 = 1;
                    i27 = 0;
                    c11 = '\t';
                } else {
                    i17 = i25;
                    i15 = i27;
                    i16 = 1;
                    c11 = '\t';
                    i27 = i15;
                }
                xmlResourceParser.next();
                i13 = i16;
                xml = xmlResourceParser;
                i24 = i28;
                i25 = i17;
            }
            aVar2 = new e3.a(dVar2.b(), i24 | aVar3.f40822b);
            cVar.f24776a.put(bVar, new WeakReference(aVar2));
        }
        j0 j0VarD = l2.a.d(aVar2.f24772a, sVar);
        sVar.p(false);
        return j0VarD;
    }
}
