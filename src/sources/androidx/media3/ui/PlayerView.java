package androidx.media3.ui;

import a5.b;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.PlayerView;
import b0.h2;
import b7.a;
import com.google.common.collect.ImmutableList;
import com.yalantis.ucrop.view.CropImageView;
import h9.a0;
import h9.b0;
import h9.c0;
import h9.r;
import h9.w;
import h9.y;
import h9.z;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import qp.i;
import y6.j0;
import y6.m;
import y6.u0;
import y6.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f2264l0 = 0;
    public final ImageView H;
    public final SubtitleView K;
    public final View L;
    public final TextView M;
    public final PlayerControlView N;
    public final FrameLayout O;
    public final FrameLayout P;
    public final Handler Q;
    public final Class R;
    public final Method S;
    public final Object T;
    public j0 U;
    public boolean V;
    public r W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f2265a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f2266a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AspectRatioFrameLayout f2267b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f2268b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f2269c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Drawable f2270c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f2271d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f2272d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2273e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f2274e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f2275f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public CharSequence f2276f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f2277g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f2278h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f2279i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f2280j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f2281k0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f2282t;

    public PlayerView(Context context) {
        this(context, null);
    }

    public static void a(PlayerView playerView, Bitmap bitmap) {
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        j0 j0Var = playerView.U;
        if (j0Var != null && ((h2) j0Var).e0(30) && j0Var.v().a(2)) {
            return;
        }
        ImageView imageView = playerView.f2282t;
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.o();
        }
        View view = playerView.f2269c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f2282t;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        o();
    }

    private void setImageOutput(j0 j0Var) {
        Class cls = this.R;
        if (cls == null || !cls.isAssignableFrom(j0Var.getClass())) {
            return;
        }
        try {
            Method method = this.S;
            method.getClass();
            Object obj = this.T;
            obj.getClass();
            method.invoke(j0Var, obj);
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    public final boolean b() {
        j0 j0Var = this.U;
        return j0Var != null && this.T != null && ((h2) j0Var).e0(30) && j0Var.v().a(4);
    }

    public final void c() {
        ImageView imageView = this.f2282t;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    public final boolean d() {
        j0 j0Var = this.U;
        return j0Var != null && ((h2) j0Var).e0(16) && this.U.d() && this.U.g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b0 b0Var;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (b0Var = this.f2275f) != null && this.f2281k0) {
            b0Var.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        j0 j0Var = this.U;
        if (j0Var != null && ((h2) j0Var).e0(16) && this.U.d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z11 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        PlayerControlView playerControlView = this.N;
        if (z11 && p() && !playerControlView.j()) {
            e(true);
            return true;
        }
        if ((p() && playerControlView.d(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (z11 && p()) {
            e(true);
        }
        return false;
    }

    public final void e(boolean z11) {
        if (!(d() && this.f2279i0) && p()) {
            PlayerControlView playerControlView = this.N;
            boolean z12 = playerControlView.j() && playerControlView.getShowTimeoutMs() <= 0;
            boolean zG = g();
            if (z11 || z12 || zG) {
                h(zG);
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.H;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f2266a0 == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f2267b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        j0 j0Var = this.U;
        if (j0Var == null) {
            return true;
        }
        int iU = j0Var.u();
        if (!this.f2278h0) {
            return false;
        }
        if (((h2) this.U).e0(17) && this.U.F().p()) {
            return false;
        }
        if (iU != 1 && iU != 4) {
            j0 j0Var2 = this.U;
            j0Var2.getClass();
            if (j0Var2.g()) {
                return false;
            }
        }
        return true;
    }

    public List<i> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            arrayList.add(new i(frameLayout));
        }
        PlayerControlView playerControlView = this.N;
        if (playerControlView != null) {
            arrayList.add(new i(playerControlView));
        }
        return ImmutableList.n(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.O;
        a.l(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.f2266a0;
    }

    public boolean getControllerAutoShow() {
        return this.f2278h0;
    }

    public boolean getControllerHideOnTouch() {
        return this.f2280j0;
    }

    public int getControllerShowTimeoutMs() {
        return this.f2277g0;
    }

    public Drawable getDefaultArtwork() {
        return this.f2270c0;
    }

    public int getImageDisplayMode() {
        return this.f2268b0;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.P;
    }

    public j0 getPlayer() {
        return this.U;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f2267b;
        a.k(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.K;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f2266a0 != 0;
    }

    public boolean getUseController() {
        return this.V;
    }

    public View getVideoSurfaceView() {
        return this.f2271d;
    }

    public final void h(boolean z11) {
        if (p()) {
            int i11 = z11 ? 0 : this.f2277g0;
            PlayerControlView playerControlView = this.N;
            playerControlView.setShowTimeoutMs(i11);
            w wVar = playerControlView.f2225a;
            PlayerControlView playerControlView2 = wVar.f32101a;
            if (!playerControlView2.l()) {
                playerControlView2.setVisibility(0);
                playerControlView2.m();
                ImageView imageView = playerControlView2.W;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            wVar.k();
        }
    }

    public final void i() {
        if (!p() || this.U == null) {
            return;
        }
        PlayerControlView playerControlView = this.N;
        if (!playerControlView.j()) {
            e(true);
        } else if (this.f2280j0) {
            playerControlView.g();
        }
    }

    public final void j() {
        j0 j0Var = this.U;
        z0 z0VarM = j0Var != null ? j0Var.m() : z0.f57406d;
        int i11 = z0VarM.f57407a;
        int i12 = z0VarM.f57408b;
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        float f11 = (i12 == 0 || i11 == 0) ? 0.0f : (i11 * z0VarM.f57409c) / i12;
        if (!this.f2273e) {
            f5 = f11;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f2267b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public final void k() {
        boolean z11;
        View view = this.L;
        if (view != null) {
            j0 j0Var = this.U;
            if (j0Var == null || j0Var.u() != 2) {
                z11 = false;
            } else {
                int i11 = this.f2272d0;
                z11 = true;
                if (i11 != 2 && (i11 != 1 || !this.U.g())) {
                    z11 = false;
                }
            }
            view.setVisibility(z11 ? 0 : 8);
        }
    }

    public final void l() {
        PlayerControlView playerControlView = this.N;
        if (playerControlView == null || !this.V) {
            setContentDescription(null);
        } else if (playerControlView.j()) {
            setContentDescription(this.f2280j0 ? getResources().getString(com.lingodeer.R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(com.lingodeer.R.string.exo_controls_show));
        }
    }

    public final void m() {
        TextView textView = this.M;
        if (textView != null) {
            CharSequence charSequence = this.f2276f0;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                j0 j0Var = this.U;
                if (j0Var != null) {
                    j0Var.q();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void n(boolean z11) {
        byte[] bArr;
        Drawable drawable;
        j0 j0Var = this.U;
        boolean zF = false;
        boolean z12 = (j0Var == null || !((h2) j0Var).e0(30) || j0Var.v().f57370a.isEmpty()) ? false : true;
        boolean z13 = this.f2274e0;
        ImageView imageView = this.H;
        View view = this.f2269c;
        if (!z13 && (!z12 || z11)) {
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            c();
        }
        if (z12) {
            j0 j0Var2 = this.U;
            boolean z14 = j0Var2 != null && ((h2) j0Var2).e0(30) && j0Var2.v().a(2);
            boolean zB = b();
            if (!z14 && !zB) {
                if (view != null) {
                    view.setVisibility(0);
                }
                c();
            }
            ImageView imageView2 = this.f2282t;
            boolean z15 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zB && !z14 && z15) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    o();
                }
            } else if (z14 && !zB && z15) {
                c();
            }
            if (!z14 && !zB && this.f2266a0 != 0) {
                a.k(imageView);
                if (j0Var != null && ((h2) j0Var).e0(18) && (bArr = j0Var.M().f57154f) != null) {
                    zF = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zF || f(this.f2270c0)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f2282t;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f2268b0 == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f2267b) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.U == null) {
            return false;
        }
        e(true);
        return true;
    }

    public final boolean p() {
        if (!this.V) {
            return false;
        }
        a.k(this.N);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i11) {
        a.j(i11 == 0 || this.H != null);
        if (this.f2266a0 != i11) {
            this.f2266a0 = i11;
            n(false);
        }
    }

    public void setAspectRatioListener(h9.a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f2267b;
        a.k(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAnimationEnabled(boolean z11) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.setAnimationEnabled(z11);
    }

    public void setControllerAutoShow(boolean z11) {
        this.f2278h0 = z11;
    }

    public void setControllerHideDuringAds(boolean z11) {
        this.f2279i0 = z11;
    }

    public void setControllerHideOnTouch(boolean z11) {
        a.k(this.N);
        this.f2280j0 = z11;
        l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(h9.i iVar) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.setOnFullScreenModeChangedListener(iVar);
    }

    public void setControllerShowTimeoutMs(int i11) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        this.f2277g0 = i11;
        if (playerControlView.j()) {
            h(g());
        }
    }

    public void setControllerVisibilityListener(z zVar) {
        if (zVar != null) {
            setControllerVisibilityListener((r) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        a.j(this.M != null);
        this.f2276f0 = charSequence;
        m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f2270c0 != drawable) {
            this.f2270c0 = drawable;
            n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z11) {
        this.f2281k0 = z11;
    }

    public void setErrorMessageProvider(m mVar) {
        if (mVar != null) {
            m();
        }
    }

    public void setFullscreenButtonClickListener(a0 a0Var) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.setOnFullScreenModeChangedListener(this.f2265a);
    }

    public void setFullscreenButtonState(boolean z11) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.o(z11);
    }

    public void setImageDisplayMode(int i11) {
        a.j(this.f2282t != null);
        if (this.f2268b0 != i11) {
            this.f2268b0 = i11;
            o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z11) {
        if (this.f2274e0 != z11) {
            this.f2274e0 = z11;
            n(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f3  */
    /* JADX WARN: Multi-variable type inference failed */
    public void setPlayer(j0 j0Var) {
        a.j(Looper.myLooper() == Looper.getMainLooper());
        a.d(j0Var == null || j0Var.G() == Looper.getMainLooper());
        j0 j0Var2 = this.U;
        if (j0Var2 == j0Var) {
            return;
        }
        View view = this.f2271d;
        y yVar = this.f2265a;
        if (j0Var2 != null) {
            j0Var2.B(yVar);
            if (((h2) j0Var2).e0(27)) {
                if (view instanceof TextureView) {
                    j0Var2.l((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    j0Var2.A((SurfaceView) view);
                }
            }
            Class cls = this.R;
            if (cls != null && cls.isAssignableFrom(j0Var2.getClass())) {
                try {
                    Method method = this.S;
                    method.getClass();
                    method.invoke(j0Var2, null);
                } catch (IllegalAccessException | InvocationTargetException e8) {
                    throw new RuntimeException(e8);
                }
            }
        }
        SubtitleView subtitleView = this.K;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.U = j0Var;
        boolean zP = p();
        PlayerControlView playerControlView = this.N;
        if (zP) {
            playerControlView.setPlayer(j0Var);
        }
        k();
        m();
        n(true);
        if (j0Var == null) {
            if (playerControlView != null) {
                playerControlView.g();
                return;
            }
            return;
        }
        h2 h2Var = (h2) j0Var;
        if (h2Var.e0(27)) {
            if (view instanceof TextureView) {
                j0Var.L((TextureView) view);
            } else if (view instanceof SurfaceView) {
                j0Var.o((SurfaceView) view);
            }
            if (h2Var.e0(30)) {
                ImmutableList immutableList = j0Var.v().f57370a;
                boolean z11 = false;
                loop0: for (int i11 = 0; i11 < immutableList.size(); i11++) {
                    if (((u0) immutableList.get(i11)).f57364b.f57306c == 2) {
                        u0 u0Var = (u0) immutableList.get(i11);
                        for (int i12 = 0; i12 < u0Var.f57366d.length; i12++) {
                            if (u0Var.a(i12)) {
                                z11 = true;
                                break loop0;
                            }
                        }
                    }
                }
                if (z11) {
                    j();
                }
            } else {
                j();
            }
        }
        if (subtitleView != null && h2Var.e0(28)) {
            subtitleView.setCues(j0Var.w().f433a);
        }
        j0Var.i(yVar);
        setImageOutput(j0Var);
        e(false);
    }

    public void setRepeatToggleModes(int i11) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.setRepeatToggleModes(i11);
    }

    public void setResizeMode(int i11) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f2267b;
        a.k(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i11);
    }

    public void setShowBuffering(int i11) {
        if (this.f2272d0 != i11) {
            this.f2272d0 = i11;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z11) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.setShowFastForwardButton(z11);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z11) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.setShowMultiWindowTimeBar(z11);
    }

    public void setShowNextButton(boolean z11) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.setShowNextButton(z11);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z11) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.setShowPlayButtonIfPlaybackIsSuppressed(z11);
    }

    public void setShowPreviousButton(boolean z11) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.setShowPreviousButton(z11);
    }

    public void setShowRewindButton(boolean z11) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.setShowRewindButton(z11);
    }

    public void setShowShuffleButton(boolean z11) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.setShowShuffleButton(z11);
    }

    public void setShowSubtitleButton(boolean z11) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.setShowSubtitleButton(z11);
    }

    public void setShowVrButton(boolean z11) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.setShowVrButton(z11);
    }

    public void setShutterBackgroundColor(int i11) {
        View view = this.f2269c;
        if (view != null) {
            view.setBackgroundColor(i11);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z11) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        playerControlView.setTimeBarScrubbingEnabled(z11);
    }

    @Deprecated
    public void setUseArtwork(boolean z11) {
        setArtworkDisplayMode(!z11 ? 1 : 0);
    }

    public void setUseController(boolean z11) {
        boolean z12 = true;
        PlayerControlView playerControlView = this.N;
        a.j((z11 && playerControlView == null) ? false : true);
        if (!z11 && !hasOnClickListeners()) {
            z12 = false;
        }
        setClickable(z12);
        if (this.V == z11) {
            return;
        }
        this.V = z11;
        if (p()) {
            playerControlView.setPlayer(this.U);
        } else if (playerControlView != null) {
            playerControlView.g();
            playerControlView.setPlayer(null);
        }
        l();
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        View view = this.f2271d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i11);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setControllerVisibilityListener(r rVar) {
        PlayerControlView playerControlView = this.N;
        a.k(playerControlView);
        CopyOnWriteArrayList copyOnWriteArrayList = playerControlView.L;
        r rVar2 = this.W;
        if (rVar2 == rVar) {
            return;
        }
        if (rVar2 != null) {
            copyOnWriteArrayList.remove(rVar2);
        }
        this.W = rVar;
        if (rVar != null) {
            copyOnWriteArrayList.add(rVar);
            setControllerVisibilityListener((z) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i11) {
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z15;
        boolean z16;
        int i21;
        boolean z17;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i22;
        super(context, attributeSet, i11);
        y yVar = new y(this);
        this.f2265a = yVar;
        this.Q = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f2267b = null;
            this.f2269c = null;
            this.f2271d = null;
            this.f2273e = false;
            this.f2275f = null;
            this.f2282t = null;
            this.H = null;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
            this.P = null;
            this.R = null;
            this.S = null;
            this.T = null;
            ImageView imageView = new ImageView(context);
            Resources resources = getResources();
            imageView.setImageDrawable(resources.getDrawable(2131231458, context.getTheme()));
            imageView.setBackgroundColor(resources.getColor(com.lingodeer.R.color.exo_edit_mode_background_color, null));
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c0.f32020e, i11, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, com.lingodeer.R.layout.exo_player_view);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i23 = typedArrayObtainStyledAttributes.getInt(3, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i24 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(51, true);
                int i25 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i26 = typedArrayObtainStyledAttributes.getInt(28, 0);
                z11 = z19;
                i12 = typedArrayObtainStyledAttributes.getInt(38, 5000);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.f2274e0 = typedArrayObtainStyledAttributes.getBoolean(16, this.f2274e0);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                z14 = z22;
                z12 = z20;
                z16 = z18;
                i19 = color;
                i13 = resourceId;
                i15 = resourceId2;
                i17 = i26;
                z13 = z21;
                i14 = integer;
                i21 = i23;
                z15 = zHasValue;
                i18 = i25;
                i16 = i24;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i12 = 5000;
            i13 = com.lingodeer.R.layout.exo_player_view;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = true;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
            i18 = 1;
            i19 = 0;
            z15 = false;
            z16 = true;
            i21 = 1;
        }
        LayoutInflater.from(context).inflate(i13, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(com.lingodeer.R.id.exo_content_frame);
        this.f2267b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i17);
        }
        View viewFindViewById = findViewById(com.lingodeer.R.id.exo_shutter);
        this.f2269c = viewFindViewById;
        if (viewFindViewById != null && z15) {
            viewFindViewById.setBackgroundColor(i19);
        }
        if (aspectRatioFrameLayout != null && i18 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i18 == 2) {
                this.f2271d = new TextureView(context);
            } else {
                if (i18 == 3) {
                    try {
                        int i27 = SphericalGLSurfaceView.N;
                        this.f2271d = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                        z17 = true;
                    } catch (Exception e8) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e8);
                    }
                } else if (i18 != 4) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (Build.VERSION.SDK_INT >= 34) {
                        b.p(surfaceView);
                    }
                    this.f2271d = surfaceView;
                } else {
                    try {
                        int i28 = VideoDecoderGLSurfaceView.f2144b;
                        this.f2271d = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e10) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e10);
                    }
                }
                this.f2271d.setLayoutParams(layoutParams);
                this.f2271d.setOnClickListener(yVar);
                this.f2271d.setClickable(false);
                aspectRatioFrameLayout.addView(this.f2271d, 0);
            }
            z17 = false;
            this.f2271d.setLayoutParams(layoutParams);
            this.f2271d.setOnClickListener(yVar);
            this.f2271d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f2271d, 0);
        } else {
            this.f2271d = null;
            z17 = false;
        }
        this.f2273e = z17;
        this.f2275f = Build.VERSION.SDK_INT == 34 ? new b0() : null;
        this.O = (FrameLayout) findViewById(com.lingodeer.R.id.exo_ad_overlay);
        this.P = (FrameLayout) findViewById(com.lingodeer.R.id.exo_overlay);
        this.f2282t = (ImageView) findViewById(com.lingodeer.R.id.exo_image);
        this.f2268b0 = i16;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: h9.x
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    int i29 = PlayerView.f2264l0;
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) objArr[1];
                    PlayerView playerView = this.f32126a;
                    playerView.Q.post(new b2.c(21, playerView, bitmap));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.R = cls;
        this.S = method;
        this.T = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(com.lingodeer.R.id.exo_artwork);
        this.H = imageView2;
        this.f2266a0 = (!z16 || i21 == 0 || imageView2 == null) ? 0 : i21;
        if (i15 != 0) {
            this.f2270c0 = getContext().getDrawable(i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(com.lingodeer.R.id.exo_subtitles);
        this.K = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById2 = findViewById(com.lingodeer.R.id.exo_buffering);
        this.L = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f2272d0 = i14;
        TextView textView = (TextView) findViewById(com.lingodeer.R.id.exo_error_message);
        this.M = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(com.lingodeer.R.id.exo_controller);
        View viewFindViewById3 = findViewById(com.lingodeer.R.id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.N = playerControlView;
            i22 = 0;
        } else if (viewFindViewById3 != null) {
            i22 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.N = playerControlView2;
            playerControlView2.setId(com.lingodeer.R.id.exo_controller);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i22 = 0;
            this.N = null;
        }
        PlayerControlView playerControlView3 = this.N;
        this.f2277g0 = playerControlView3 != null ? i12 : i22;
        this.f2280j0 = z12;
        this.f2278h0 = z13;
        this.f2279i0 = z14;
        this.V = (!z11 || playerControlView3 == null) ? i22 : 1;
        if (playerControlView3 != null) {
            w wVar = playerControlView3.f2225a;
            int i29 = wVar.f32125z;
            if (i29 != 3 && i29 != 2) {
                wVar.f();
                wVar.i(2);
            }
            PlayerControlView playerControlView4 = this.N;
            y yVar2 = this.f2265a;
            playerControlView4.getClass();
            yVar2.getClass();
            playerControlView4.L.add(yVar2);
        }
        if (z11) {
            setClickable(true);
        }
        l();
    }
}
