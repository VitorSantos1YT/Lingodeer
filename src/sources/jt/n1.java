package jt;

import bt.t5;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import rt.x4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f37082b;

    public /* synthetic */ n1(boolean z11, int i11) {
        this.f37081a = i11;
        this.f37082b = z11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f37081a) {
            case 0:
                return t5.j((CourseWord) obj, this.f37082b);
            case 1:
                return t5.e((CourseWord) obj, this.f37082b);
            case 2:
                return t5.e((CourseWord) obj, this.f37082b);
            case 3:
                return t5.j((CourseWord) obj, this.f37082b);
            case 4:
                x4 it = (x4) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return x4.a(it, null, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, false, null, this.f37082b, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 3967);
            default:
                x4 it2 = (x4) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                return x4.a(it2, null, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, this.f37082b, null, false, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 4063);
        }
    }
}
