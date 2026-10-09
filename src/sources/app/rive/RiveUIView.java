package app.rive;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Fit;
import fz.e;
import fz.f;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.t;
import t1.d;
import uz.g1;
import uz.p0;
import uz.x0;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveUIView extends FrameLayout {
    public static final int $stable = 8;
    private final p0 _fileFlow;
    private final b1 alignment$delegate;
    private final b1 artboardName$delegate;
    private final ComposeView compose;
    private f errorContent;
    private final b1 fileSpec$delegate;
    private final b1 fit$delegate;
    private e loadingContent;
    private final b1 stateMachineName$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RiveUIView(Context context) {
        this(context, null, 0, 6, null);
        m.f(context, "context");
    }

    public final Alignment getAlignment() {
        return (Alignment) this.alignment$delegate.getValue();
    }

    public final String getArtboardName() {
        return (String) this.artboardName$delegate.getValue();
    }

    public final f getErrorContent() {
        return this.errorContent;
    }

    public final g1 getFileFlow() {
        return this._fileFlow;
    }

    public final RiveFileSource getFileSpec() {
        return (RiveFileSource) this.fileSpec$delegate.getValue();
    }

    public final Fit getFit() {
        return (Fit) this.fit$delegate.getValue();
    }

    public final e getLoadingContent() {
        return this.loadingContent;
    }

    public final String getStateMachineName() {
        return (String) this.stateMachineName$delegate.getValue();
    }

    public final void setAlignment(Alignment alignment) {
        m.f(alignment, "<set-?>");
        this.alignment$delegate.setValue(alignment);
    }

    public final void setArtboardName(String str) {
        this.artboardName$delegate.setValue(str);
    }

    public final void setErrorContent(f fVar) {
        this.errorContent = fVar;
    }

    public final void setFileSpec(RiveFileSource riveFileSource) {
        this.fileSpec$delegate.setValue(riveFileSource);
    }

    public final void setFit(Fit fit) {
        m.f(fit, "<set-?>");
        this.fit$delegate.setValue(fit);
    }

    public final void setLoadingContent(e eVar) {
        this.loadingContent = eVar;
    }

    public final void setStateMachineName(String str) {
        this.stateMachineName$delegate.setValue(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RiveUIView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        m.f(context, "context");
    }

    public /* synthetic */ RiveUIView(Context context, AttributeSet attributeSet, int i11, int i12, kotlin.jvm.internal.f fVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveUIView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m.f(context, "context");
        this.fileSpec$delegate = t.B(null);
        this.artboardName$delegate = t.B(null);
        this.stateMachineName$delegate = t.B(null);
        this.fit$delegate = t.B(Fit.CONTAIN);
        this.alignment$delegate = t.B(Alignment.CENTER);
        this._fileFlow = x0.c(Result.Loading.INSTANCE);
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setViewCompositionStrategy(p1.f58645c);
        composeView.setContent(new d(new RiveUIView$compose$1$1(this), true, 1317471930));
        this.compose = composeView;
        addView(composeView, new FrameLayout.LayoutParams(-1, -1));
    }

    private static /* synthetic */ void getCompose$annotations() {
    }
}
