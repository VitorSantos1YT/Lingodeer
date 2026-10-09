package av;

import bv.l0;
import bv.v0;
import bv.y0;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.lingodeer.data.model.SerializablePhonemeLevelTimingResult;
import com.lingodeer.data.model.SerializableSyllableLevelTimingResult;
import com.lingodeer.data.model.SerializableTimingResult;
import com.lingodeer.data.model.WordAccuracyScoreTimingResult;
import com.lingodeer.data.model.speech.SpeechRecognitionResult;
import com.lingodeer.network.model.AIAudioText;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.ServerJsonResponse;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.o0;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.MediaType;
import rz.b1;
import rz.z1;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f3147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dv.l f3148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah.b f3149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z1 f3150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qy.q f3151e = com.bumptech.glide.d.v(new d(this, 0));

    public i(n0 n0Var, dv.l lVar, ah.b bVar) {
        this.f3147a = n0Var;
        this.f3148b = lVar;
        this.f3149c = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object a(i iVar, File file, String str, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        g gVar;
        Object objL;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.f3134c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f3134c = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(iVar, cVar);
            }
        } else {
            gVar = new g(iVar, cVar);
        }
        g gVar2 = gVar;
        Object objA = gVar2.f3132a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = gVar2.f3134c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objA);
            dv.l lVar = iVar.f3148b;
            String strN = xt.d.n(((o0) iVar.f3147a).f27733a.keyLanguage);
            gVar2.f3134c = 1;
            JsonObject jsonObjectC = ep.a.c("audio_lan", strN);
            jsonObjectC.addProperty("uid", ((o0) lVar.f24480a).w());
            jsonObjectC.addProperty("audio_script", str);
            qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", (hv.a) lVar.f24481b.getValue());
            qy.l lVar2 = (qy.l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar2.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar2.f48496b;
            String asString = ((JsonObject) lVarY.f48495a).get("token").getAsString();
            MediaType.f45062e.getClass();
            objA = lVar.a(secretKey, secretKey2, new TypeToken<ServerJsonResponse<AIAudioText>>() { // from class: com.lingodeer.network.AzureNetworkClient$speechAssessment$2
            }, new dv.k(lVar, asString, file, MediaType.Companion.b("text/plain"), null), gVar2);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objA);
        }
        ApiResponse apiResponse = (ApiResponse) objA;
        if (apiResponse instanceof ApiResponse.Error) {
            return null;
        }
        if (!(apiResponse instanceof ApiResponse.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        ((AIAudioText) ((ApiResponse.Success) apiResponse).getData()).getAudio_text();
        try {
            h00.s sVar = xt.c.f56291a;
            String audio_text = ((AIAudioText) ((ApiResponse.Success) apiResponse).getData()).getAudio_text();
            sVar.getClass();
            objL = (SpeechRecognitionResult) sVar.b(SpeechRecognitionResult.Companion.serializer(), audio_text);
        } catch (Throwable th2) {
            objL = com.bumptech.glide.e.l(th2);
        }
        Throwable thA = qy.o.a(objL);
        if (thA == null) {
            return (SpeechRecognitionResult) objL;
        }
        thA.printStackTrace();
        return null;
    }

    public static final String d(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
        return oz.x.q0(oz.x.q0(oz.q.i1(lowerCase).toString(), " ", BuildConfig.VERSION_NAME), "\"", BuildConfig.VERSION_NAME);
    }

    public final void b(File file, String referenceText, List list, List list2, fz.e eVar, fz.a aVar) {
        kotlin.jvm.internal.m.f(referenceText, "referenceText");
        list.toString();
        if (!file.exists()) {
            aVar.invoke();
            return;
        }
        z1 z1Var = this.f3150d;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        this.f3150d = rz.e0.B(b1.f50869a, null, null, new e(this, file, referenceText, aVar, list, list2, eVar, null, 0), 3);
    }

    public final void c() {
        z1 z1Var = this.f3150d;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object e(File file, String str, String str2, List list, xy.c cVar) throws Throwable {
        f fVar;
        List<String> list2;
        Object objF;
        Object obj;
        int iMin;
        String str3 = str2;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.f3128e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f3128e = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj2 = fVar.f3126c;
        Object obj3 = wy.a.COROUTINE_SUSPENDED;
        int i12 = fVar.f3128e;
        Object obj4 = null;
        int i13 = 1;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj2);
                file.getName();
                if (!file.exists()) {
                    file.getAbsolutePath();
                    return null;
                }
                fVar.f3124a = str3;
                list2 = list;
                fVar.f3125b = list2;
                fVar.f3128e = 1;
                objF = f(file, str, str3, fVar);
                if (objF == obj3) {
                    return obj3;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list3 = fVar.f3125b;
                String str4 = fVar.f3124a;
                com.bumptech.glide.e.F(obj2);
                list2 = list3;
                str3 = str4;
                objF = obj2;
            }
            l0 l0Var = (l0) objF;
            if (l0Var != null) {
                bv.i iVar = l0Var.f6322e;
                l0Var.toString();
                int i14 = bv.q.a(str3).f6340b;
                double d5 = iVar.f6303a;
                List<v0> list4 = iVar.f6305c;
                int iP = hz.b.P(d5);
                ArrayList arrayList = new ArrayList(ry.n.W(list4, 10));
                Iterator it = list4.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    String str5 = BuildConfig.VERSION_NAME;
                    if (!zHasNext) {
                        break;
                    }
                    v0 v0Var = (v0) it.next();
                    List list5 = v0Var.f6365h;
                    y0 y0Var = v0Var.f6369l;
                    obj = obj4;
                    try {
                        int i15 = list5.size() == i13 ? i13 : 0;
                        if (i15 == 0) {
                            str5 = ((bv.o) ry.m.q0(list5)).f6335e;
                        }
                        String str6 = str5;
                        Iterator it2 = it;
                        int iP2 = hz.b.P(((bv.o) ry.m.q0(list5)).f6331a);
                        String str7 = (i15 != 0 ? (bv.o) ry.m.q0(list5) : (bv.o) list5.get(i13)).f6335e;
                        int iP3 = i15 != 0 ? hz.b.P(((bv.o) ry.m.q0(list5)).f6331a) : hz.b.P(((bv.o) list5.get(i13)).f6331a);
                        String str8 = v0Var.f6368k;
                        int iP4 = hz.b.P(y0Var.f6377b);
                        if (iP4 == 0) {
                            iMin = 0;
                        } else if (iP4 >= 90) {
                            iMin = iP4;
                        } else {
                            iMin = Math.min((int) ((((double) 70) * (1.0d / (Math.exp((-0.08d) * ((double) (iP4 - 60))) + 1.0d))) + ((double) 30)), 89);
                        }
                        arrayList.add(new bv.c0(str6, iP2, str7, iP3, str8, iMin, hz.b.P(y0Var.f6378c)));
                        it = it2;
                        iP = iP;
                        obj4 = obj;
                        i13 = 1;
                    } catch (Exception unused) {
                        return obj;
                    }
                    return obj;
                }
                obj = obj4;
                bv.z zVar = new bv.z(str3, i14, iP, arrayList);
                ArrayList arrayList2 = new ArrayList(ry.n.W(list2, 10));
                for (String str9 : list2) {
                    double d11 = iVar.f6303a;
                    ArrayList arrayList3 = new ArrayList(ry.n.W(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        List list6 = ((v0) it3.next()).f6365h;
                        ArrayList arrayList4 = new ArrayList(ry.n.W(list6, 10));
                        Iterator it4 = list6.iterator();
                        while (it4.hasNext()) {
                            bv.o oVar = (bv.o) it4.next();
                            arrayList4.add(new SerializablePhonemeLevelTimingResult(oVar.f6335e, oVar.f6331a));
                            it4 = it4;
                            d11 = d11;
                        }
                        arrayList3.add(arrayList4);
                        d11 = d11;
                    }
                    double d12 = d11;
                    ArrayList arrayListX = ry.n.X(arrayList3);
                    ArrayList arrayList5 = new ArrayList(ry.n.W(list4, 10));
                    for (v0 v0Var2 : list4) {
                        arrayList5.add(new SerializableSyllableLevelTimingResult(v0Var2.f6361d, v0Var2.f6369l.f6377b, BuildConfig.VERSION_NAME));
                        iVar = iVar;
                        list4 = list4;
                    }
                    arrayList2.add(new WordAccuracyScoreTimingResult(str9, new SerializableTimingResult(str9, d12, BuildConfig.VERSION_NAME, arrayListX, arrayList5)));
                    iVar = iVar;
                    list4 = list4;
                }
                return new j(str3, arrayList2, zVar);
            }
        } catch (Exception unused2) {
        }
        return obj4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(File file, String str, String str2, xy.c cVar) throws Throwable {
        h hVar;
        Object objL;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i11 = hVar.f3144c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f3144c = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        h hVar2 = hVar;
        Object objC = hVar2.f3142a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = hVar2.f3144c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objC);
            y yVar = (y) this.f3151e.getValue();
            String strW = ((o0) this.f3147a).w();
            hVar2.f3144c = 1;
            objC = yVar.c(file, str, str2, strW, hVar2);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objC);
        }
        String str3 = (String) objC;
        if (str3 == null) {
            return null;
        }
        try {
            bv.i0 i0VarQ = ns.o.q(xt.c.f56291a, str3);
            if (i0VarQ instanceof bv.h0) {
                objL = ((bv.h0) i0VarQ).f6301a;
            } else {
                if (!(i0VarQ instanceof bv.g0)) {
                    throw new NoWhenBranchMatchedException();
                }
                objL = null;
            }
        } catch (Throwable th2) {
            objL = com.bumptech.glide.e.l(th2);
        }
        if (objL instanceof qy.n) {
            return null;
        }
        return objL;
    }
}
