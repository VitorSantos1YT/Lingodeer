package rt;

import android.net.Uri;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.env.FontSizeStyleKt;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.yalantis.ucrop.view.CropImageView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z3 extends xy.i implements fz.i {
    public final /* synthetic */ b4 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f50753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f50755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ fb f50756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ t f50757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ pf f50758f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ qy.l f50759t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(b4 b4Var, vy.d dVar) {
        super(6, dVar);
        this.H = b4Var;
    }

    @Override // fz.i
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        z3 z3Var = new z3(this.H, (vy.d) obj6);
        z3Var.f50755c = (List) obj;
        z3Var.f50756d = (fb) obj2;
        z3Var.f50757e = (t) obj3;
        z3Var.f50758f = (pf) obj4;
        z3Var.f50759t = (qy.l) obj5;
        return z3Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        Object objU;
        int iIntValue;
        fe feVar;
        LinkedHashMap linkedHashMapE;
        b4 b4Var = this.H;
        List list = b4Var.P;
        boolean z11 = b4Var.O;
        uz.i1 i1Var = b4Var.Y;
        vt.n0 n0Var = b4Var.f49491d;
        List list2 = this.f50755c;
        fb fbVar = this.f50756d;
        t tVar = this.f50757e;
        pf pfVar = this.f50758f;
        qy.l lVar = this.f50759t;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f50754b;
        String path = null;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            zBooleanValue = ((Boolean) lVar.f48495a).booleanValue();
            if (((Boolean) lVar.f48496b).booleanValue()) {
                return o2.f50180a;
            }
            if (!(fbVar instanceof cb)) {
                return fbVar instanceof db ? new p2(((db) fbVar).f49634a) : new p2(CropImageView.DEFAULT_ASPECT_RATIO);
            }
            wt.m mVar = b4Var.f49485a;
            bh.r rVar = new bh.r(mVar.b(), mVar, 29);
            this.f50755c = list2;
            this.f50756d = null;
            this.f50757e = tVar;
            this.f50758f = pfVar;
            this.f50759t = null;
            this.f50753a = zBooleanValue;
            this.f50754b = 1;
            objU = uz.x0.u(rVar, this);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z12 = this.f50753a;
            com.bumptech.glide.e.F(obj);
            zBooleanValue = z12;
            objU = obj;
        }
        int iIntValue2 = ((Number) objU).intValue();
        if (iIntValue2 == -1) {
            if (((Number) i1Var.getValue()).intValue() < 0) {
                Env env = ((fr.o0) n0Var).f27733a;
                lz.g gVar = new lz.g(0, (env.enableNativeSpeakerVideos && xt.d.g(env.keyLanguage)) ? 3 : 2, 1);
                jz.d dVar = jz.e.f37397a;
                Integer num = new Integer(hz.b.N(gVar));
                i1Var.getClass();
                i1Var.l(null, num);
            }
            iIntValue = ((Number) i1Var.getValue()).intValue();
        } else {
            iIntValue = iIntValue2;
        }
        if (tVar.f50397a >= list2.size()) {
            boolean z13 = b4Var.O;
            int i12 = tVar.f50397a;
            int size = list.size();
            Set set = pfVar.f50254a;
            Set set2 = pfVar.f50255b;
            int size2 = ((size - set.size()) - set2.size()) - pfVar.f50256c.size();
            int i13 = size2 < 0 ? 0 : size2;
            int size3 = pfVar.f50254a.size();
            int size4 = set2.size();
            String strB = pfVar.b();
            int iT = ((fr.o0) n0Var).t();
            int iA = b4.a(b4Var);
            int iCoerceFontSizeStyle = FontSizeStyleKt.coerceFontSizeStyle(((fr.o0) n0Var).f27733a.textSizeDel);
            fr.o0 o0Var = (fr.o0) n0Var;
            Env env2 = o0Var.f27733a;
            return new q2(null, z13, false, i12, i13, size3, size4, true, strB, iT, iA, iCoerceFontSizeStyle, env2.audioSpeed, iIntValue2, iIntValue, env2.flashCardIsPlayModel, o0Var.f(), ((fr.o0) n0Var).f27733a.allowSoundEffect, 65536);
        }
        n0 n0Var2 = ((nf) list2.get(tVar.f50397a)).f50159a;
        int i14 = n0Var2.f50111d;
        boolean z14 = zBooleanValue || i14 == 1;
        String unitName = n0Var2.f50108a;
        SRSStatus srsStatus = n0Var2.f50109b;
        WordSentenceCharacterType wordSentenceCharacterType = n0Var2.f50110c;
        kotlin.jvm.internal.m.f(unitName, "unitName");
        kotlin.jvm.internal.m.f(srsStatus, "srsStatus");
        n0 n0Var3 = new n0(unitName, srsStatus, wordSentenceCharacterType, i14, z14);
        if (iIntValue == 3) {
            if (wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType) {
                Uri videoUri = ((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord().getVideoUri();
                if (videoUri != null) {
                    path = videoUri.getPath();
                }
            } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
                Uri videoUri2 = ((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getVideoUri();
                if (videoUri2 != null) {
                    path = videoUri2.getPath();
                }
            } else if (!(wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType)) {
                throw new NoWhenBranchMatchedException();
            }
            feVar = (path == null || oz.q.K0(path) || !com.google.android.material.datepicker.d.D(path)) ? new fe(2, true) : new fe(iIntValue, false);
        } else {
            feVar = new fe(iIntValue, false);
        }
        if (z11) {
            linkedHashMapE = be.f49548a;
        } else {
            b4Var.f49489c.getClass();
            linkedHashMapE = wt.b0.e(srsStatus);
        }
        LinkedHashMap linkedHashMap = linkedHashMapE;
        boolean z15 = !z11;
        boolean z16 = tVar.f50398b;
        int i15 = tVar.f50397a;
        int size5 = list.size();
        Set set3 = pfVar.f50254a;
        Set set4 = pfVar.f50255b;
        int size6 = ((size5 - set3.size()) - set4.size()) - pfVar.f50256c.size();
        int i16 = size6 < 0 ? 0 : size6;
        int size7 = pfVar.f50254a.size();
        int size8 = set4.size();
        String strB2 = pfVar.b();
        int iT2 = ((fr.o0) n0Var).t();
        int iA2 = b4.a(b4Var);
        int iCoerceFontSizeStyle2 = FontSizeStyleKt.coerceFontSizeStyle(((fr.o0) n0Var).f27733a.textSizeDel);
        fr.o0 o0Var2 = (fr.o0) n0Var;
        Env env3 = o0Var2.f27733a;
        return new q2(n0Var3, linkedHashMap, z15, z16, i15, i16, size7, size8, false, strB2, iT2, iA2, iCoerceFontSizeStyle2, env3.audioSpeed, iIntValue2, feVar.f49766a, feVar.f49767b, env3.flashCardIsPlayModel, o0Var2.f(), ((fr.o0) n0Var).f27733a.allowSoundEffect);
    }
}
