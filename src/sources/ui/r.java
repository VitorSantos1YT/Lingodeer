package ui;

import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f53008b;

    public /* synthetic */ r(s sVar, int i11) {
        this.f53007a = i11;
        this.f53008b = sVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ImageView imageView = (ImageView) obj;
        String audioPath = (String) obj2;
        switch (this.f53007a) {
            case 0:
                kotlin.jvm.internal.m.f(imageView, "imageView");
                kotlin.jvm.internal.m.f(audioPath, "audioPath");
                s sVar = this.f53008b;
                ImageView imageView2 = sVar.S;
                if (imageView2 != null) {
                    android.support.v4.media.session.a.H(imageView2.getBackground());
                }
                android.support.v4.media.session.a.K(imageView.getBackground());
                a9.i iVar = sVar.R;
                if (iVar != null) {
                    iVar.v(audioPath);
                }
                sVar.S = imageView;
                break;
            default:
                kotlin.jvm.internal.m.f(imageView, "imageView");
                kotlin.jvm.internal.m.f(audioPath, "audioPath");
                s sVar2 = this.f53008b;
                ImageView imageView3 = sVar2.S;
                if (imageView3 != null) {
                    android.support.v4.media.session.a.H(imageView3.getBackground());
                }
                android.support.v4.media.session.a.K(imageView.getBackground());
                a9.i iVar2 = sVar2.R;
                if (iVar2 != null) {
                    iVar2.v(audioPath);
                }
                sVar2.S = imageView;
                break;
        }
        return qy.b0.f48488a;
    }
}
