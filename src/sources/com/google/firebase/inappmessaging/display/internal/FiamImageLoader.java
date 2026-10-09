package com.google.firebase.inappmessaging.display.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.n;
import com.bumptech.glide.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import me.b;
import ne.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FiamImageLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f19762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f19763b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Callback extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f19764d;

        @Override // me.b, me.d
        public final void c(Drawable drawable) {
            ImageView imageView = this.f19764d;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            new Exception("Image loading failed!");
            j();
        }

        @Override // me.d
        public final void e(Object obj, c cVar) {
            Drawable drawable = (Drawable) obj;
            ImageView imageView = this.f19764d;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            k();
        }

        @Override // me.d
        public final void h(Drawable drawable) {
            ImageView imageView = this.f19764d;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            k();
        }

        public abstract void j();

        public abstract void k();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class FiamImageRequestCreator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Callback f19765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f19766b;

        public FiamImageRequestCreator(n nVar) {
        }

        public final void a() {
            Set hashSet;
            if (this.f19765a == null || TextUtils.isEmpty(this.f19766b)) {
                return;
            }
            synchronized (FiamImageLoader.this.f19763b) {
                try {
                    if (FiamImageLoader.this.f19763b.containsKey(this.f19766b)) {
                        hashSet = (Set) FiamImageLoader.this.f19763b.get(this.f19766b);
                    } else {
                        hashSet = new HashSet();
                        FiamImageLoader.this.f19763b.put(this.f19766b, hashSet);
                    }
                    if (!hashSet.contains(this.f19765a)) {
                        hashSet.add(this.f19765a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public FiamImageLoader(p pVar) {
        this.f19762a = pVar;
    }
}
