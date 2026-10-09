package wf;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookException;
import kotlin.jvm.internal.m;
import xf.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55117a;

    public /* synthetic */ e(int i11) {
        this.f55117a = i11;
    }

    @Override // wf.f
    public void b(xf.i mediaContent) {
        switch (this.f55117a) {
            case 1:
                m.f(mediaContent, "mediaContent");
                throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
            default:
                super.b(mediaContent);
                return;
        }
    }

    @Override // wf.f
    public void c(xf.k photo) {
        switch (this.f55117a) {
            case 1:
                m.f(photo, "photo");
                Bitmap bitmap = photo.f56039b;
                Uri uri = photo.f56040c;
                if (bitmap == null && uri == null) {
                    throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
                }
                return;
            default:
                super.c(photo);
                return;
        }
    }

    @Override // wf.f
    public void d(xf.m mVar) {
        switch (this.f55117a) {
            case 0:
                g.a(mVar, this);
                break;
            default:
                super.d(mVar);
                break;
        }
    }

    @Override // wf.f
    public void f(p videoContent) {
        switch (this.f55117a) {
            case 1:
                m.f(videoContent, "videoContent");
                throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
            default:
                super.f(videoContent);
                return;
        }
    }
}
