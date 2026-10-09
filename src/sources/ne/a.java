package ne;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.google.logging.type.LogSeverity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c, d {
    @Override // ne.c
    public boolean a(Object obj, me.a aVar) {
        Drawable drawable = (Drawable) obj;
        ImageView imageView = aVar.f41120a;
        Drawable drawable2 = imageView.getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(false);
        transitionDrawable.startTransition(LogSeverity.NOTICE_VALUE);
        imageView.setImageDrawable(transitionDrawable);
        return true;
    }

    @Override // ne.d
    public c h(td.a aVar) {
        return b.f43759a;
    }
}
