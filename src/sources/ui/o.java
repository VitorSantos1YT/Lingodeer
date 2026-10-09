package ui;

import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f53005b;

    public /* synthetic */ o(q qVar, int i11) {
        this.f53004a = i11;
        this.f53005b = qVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ImageView imageView = (ImageView) obj;
        String audioPath = (String) obj2;
        switch (this.f53004a) {
            case 0:
                kotlin.jvm.internal.m.f(imageView, "imageView");
                kotlin.jvm.internal.m.f(audioPath, "audioPath");
                q qVar = this.f53005b;
                ImageView imageView2 = qVar.S;
                if (imageView2 != null) {
                    android.support.v4.media.session.a.H(imageView2.getBackground());
                }
                android.support.v4.media.session.a.K(imageView.getBackground());
                a9.i iVar = qVar.R;
                if (iVar != null) {
                    iVar.v(audioPath);
                }
                qVar.S = imageView;
                break;
            default:
                kotlin.jvm.internal.m.f(imageView, "imageView");
                kotlin.jvm.internal.m.f(audioPath, "audioPath");
                q qVar2 = this.f53005b;
                ImageView imageView3 = qVar2.S;
                if (imageView3 != null) {
                    android.support.v4.media.session.a.H(imageView3.getBackground());
                }
                android.support.v4.media.session.a.K(imageView.getBackground());
                a9.i iVar2 = qVar2.R;
                if (iVar2 != null) {
                    iVar2.v(audioPath);
                }
                qVar2.S = imageView;
                break;
        }
        return qy.b0.f48488a;
    }
}
