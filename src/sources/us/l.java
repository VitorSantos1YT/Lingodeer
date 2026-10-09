package us;

import com.lingodeer.course.smarttips.data.model.ImageExampleType;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f53115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageExampleType f53116c;

    public /* synthetic */ l(ImageExampleType imageExampleType, fz.c cVar, int i11) {
        this.f53114a = i11;
        this.f53116c = imageExampleType;
        this.f53115b = cVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f53114a) {
            case 0:
                this.f53115b.invoke(this.f53116c.getElement().getAudio());
                break;
            case 1:
                this.f53115b.invoke(this.f53116c.getElement().getAudio());
                break;
            case 2:
                ImageExampleType imageExampleType = this.f53116c;
                if (imageExampleType.getElement().getAudio().length() > 0) {
                    this.f53115b.invoke(imageExampleType.getElement().getAudio());
                }
                return b0.f48488a;
            case 3:
                ImageExampleType imageExampleType2 = this.f53116c;
                if (imageExampleType2.getElement().getAudio().length() > 0) {
                    this.f53115b.invoke(imageExampleType2.getElement().getAudio());
                }
                return b0.f48488a;
            default:
                ImageExampleType imageExampleType3 = this.f53116c;
                if (imageExampleType3.getElement().getAudio().length() > 0) {
                    this.f53115b.invoke(imageExampleType3.getElement().getAudio());
                }
                return b0.f48488a;
        }
        return b0.f48488a;
    }

    public /* synthetic */ l(fz.c cVar, ImageExampleType imageExampleType, int i11) {
        this.f53114a = i11;
        this.f53115b = cVar;
        this.f53116c = imageExampleType;
    }
}
