package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.widget.ContentLoadingProgressBar;
import e5.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1420c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f1421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1422b;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f1421a);
        removeCallbacks(this.f1422b);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1421a);
        removeCallbacks(this.f1422b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [e5.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [e5.c] */
    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final int i11 = 0;
        this.f1421a = new Runnable(this) { // from class: e5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContentLoadingProgressBar f24846b;

            {
                this.f24846b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f24846b;
                switch (i12) {
                    case 0:
                        int i13 = ContentLoadingProgressBar.f1420c;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i14 = ContentLoadingProgressBar.f1420c;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
        final int i12 = 1;
        this.f1422b = new Runnable(this) { // from class: e5.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContentLoadingProgressBar f24846b;

            {
                this.f24846b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i13 = i12;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f24846b;
                switch (i13) {
                    case 0:
                        int i14 = ContentLoadingProgressBar.f1420c;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i15 = ContentLoadingProgressBar.f1420c;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
    }
}
