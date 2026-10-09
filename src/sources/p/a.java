package p;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.lingodeer.R;
import zd.q;
import zd.r;
import zd.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f46178b;

    public /* synthetic */ a() {
        this.f46177a = 0;
    }

    public static a a(Context context) {
        a aVar = new a();
        aVar.f46178b = context;
        return aVar;
    }

    public int b() {
        Configuration configuration = this.f46178b.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600) {
            return 5;
        }
        if (i11 > 960 && i12 > 720) {
            return 5;
        }
        if (i11 > 720 && i12 > 960) {
            return 5;
        }
        if (i11 >= 500) {
            return 4;
        }
        if (i11 > 640 && i12 > 480) {
            return 4;
        }
        if (i11 <= 480 || i12 <= 640) {
            return i11 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int c() {
        Context context = this.f46178b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, k.a.f37399a, R.attr.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    @Override // zd.r
    public q p(w wVar) {
        switch (this.f46177a) {
            case 1:
                return new ae.c(this.f46178b, 2);
            default:
                return new zd.b(this.f46178b, wVar.b(Integer.class, AssetFileDescriptor.class));
        }
    }

    public /* synthetic */ a(Context context, int i11) {
        this.f46177a = i11;
        this.f46178b = context;
    }
}
