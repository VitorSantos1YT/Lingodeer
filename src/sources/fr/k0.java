package fr;

import com.lingodeer.data.env.Env;
import com.yalantis.ucrop.view.CropImageView;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f27641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(float f5, int i11, Object obj, vy.d dVar) {
        super(2, dVar);
        this.f27640a = i11;
        this.f27641b = f5;
        this.f27642c = obj;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27640a) {
            case 0:
                o0 o0Var = (o0) this.f27642c;
                return new k0(this.f27641b, 0, o0Var, dVar);
            default:
                l1.b1 b1Var = (l1.b1) this.f27642c;
                return new k0(this.f27641b, 1, b1Var, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27640a) {
            case 0:
                k0 k0Var = (k0) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                k0Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                k0 k0Var2 = (k0) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                k0Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f27640a;
        qy.b0 b0Var = qy.b0.f48488a;
        float f5 = this.f27641b;
        Object obj2 = this.f27642c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                float fK = hz.b.k(f5, 0.1f, 1.0f);
                o0 o0Var = (o0) obj2;
                Env env = o0Var.f27733a;
                String coursePronunciationGuideAlphaByLanguage = env.coursePronunciationGuideAlphaByLanguage;
                kotlin.jvm.internal.m.e(coursePronunciationGuideAlphaByLanguage, "coursePronunciationGuideAlphaByLanguage");
                LinkedHashMap linkedHashMapK0 = ry.x.k0(ob.f.b(coursePronunciationGuideAlphaByLanguage));
                linkedHashMapK0.put(o0Var.a(), new Float(fK));
                env.coursePronunciationGuideAlphaByLanguage = ry.m.y0(ry.m.S0(linkedHashMapK0.entrySet(), new b4.e(19)), ";", null, null, new dv.e(23), 30);
                uz.i1 i1Var = o0Var.f27743k;
                Float f11 = new Float(fK);
                i1Var.getClass();
                i1Var.l(null, f11);
                env.updateEntry("coursePronunciationGuideAlphaByLanguage");
                break;
            default:
                l1.b1 b1Var = (l1.b1) obj2;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
                    b1Var.setValue(1);
                } else {
                    b1Var.setValue(0);
                }
                break;
        }
        return b0Var;
    }
}
