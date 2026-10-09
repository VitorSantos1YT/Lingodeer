package us;

import com.lingodeer.course.smarttips.data.model.TextExampleType;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f53101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextExampleType f53102c;

    public /* synthetic */ i(TextExampleType textExampleType, fz.c cVar) {
        this.f53100a = 0;
        this.f53102c = textExampleType;
        this.f53101b = cVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f53100a) {
            case 0:
                TextExampleType textExampleType = this.f53102c;
                if (textExampleType.getElement().getAudio().length() > 0) {
                    this.f53101b.invoke(textExampleType.getElement().getAudio());
                }
                return b0.f48488a;
            case 1:
                this.f53101b.invoke(this.f53102c.getElement().getAudio());
                break;
            default:
                this.f53101b.invoke(this.f53102c.getElement().getAudio());
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ i(fz.c cVar, TextExampleType textExampleType, int i11) {
        this.f53100a = i11;
        this.f53101b = cVar;
        this.f53102c = textExampleType;
    }
}
