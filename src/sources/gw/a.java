package gw;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29881a;

    @Override // gw.b
    public final void a(fw.b bVar, Random random) {
        switch (this.f29881a) {
            case 0:
                double dNextFloat = (random.nextFloat() * CropImageView.DEFAULT_ASPECT_RATIO) + 1.0E-4f;
                double d5 = (float) ((((double) 90) * 3.141592653589793d) / 180.0d);
                bVar.f28214i = (float) (Math.cos(d5) * dNextFloat);
                bVar.f28215j = (float) (Math.sin(d5) * dNextFloat);
                break;
            case 1:
                bVar.f28211f = (random.nextFloat() * 90.0f) + 90.0f;
                break;
            default:
                bVar.f28209d = (random.nextFloat() * 0.59999996f) + 0.7f;
                break;
        }
    }
}
