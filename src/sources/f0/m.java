package f0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f26358a;

    public m(n nVar) {
        this.f26358a = nVar;
    }

    @Override // f0.n1
    public final float a(float f5) {
        if (Float.isNaN(f5)) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        n nVar = this.f26358a;
        float fFloatValue = ((Number) nVar.f26370a.invoke(Float.valueOf(f5))).floatValue();
        nVar.f26374e.setValue(Boolean.valueOf(fFloatValue > CropImageView.DEFAULT_ASPECT_RATIO));
        nVar.f26375f.setValue(Boolean.valueOf(fFloatValue < CropImageView.DEFAULT_ASPECT_RATIO));
        return fFloatValue;
    }
}
