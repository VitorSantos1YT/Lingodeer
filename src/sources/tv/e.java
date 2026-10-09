package tv;

import android.content.Context;
import app.rive.runtime.kotlin.RiveAnimationView;
import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.SMIInput;
import app.rive.runtime.kotlin.core.errors.ArtboardException;
import com.lingodeer.ui.RiveAnimationViewClickable;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52646a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fit f52648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Alignment f52649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f52650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.c f52651f;

    public /* synthetic */ e(int i11, Fit fit, Alignment alignment, boolean z11, fz.c cVar) {
        this.f52647b = i11;
        this.f52648c = fit;
        this.f52649d = alignment;
        this.f52650e = z11;
        this.f52651f = cVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws ArtboardException {
        switch (this.f52646a) {
            case 0:
                Context context = (Context) obj;
                m.f(context, "context");
                RiveAnimationViewClickable riveAnimationViewClickable = new RiveAnimationViewClickable(context, this.f52650e);
                RiveAnimationView.setRiveResource$default(riveAnimationViewClickable, this.f52647b, null, null, null, false, false, this.f52648c, this.f52649d, null, 310, null);
                riveAnimationViewClickable.registerListener((RiveFileController.Listener) new f());
                this.f52651f.invoke(riveAnimationViewClickable);
                return riveAnimationViewClickable;
            default:
                RiveAnimationViewClickable view = (RiveAnimationViewClickable) obj;
                m.f(view, "view");
                RiveAnimationView.setRiveResource$default(view, this.f52647b, null, null, null, false, false, this.f52648c, this.f52649d, null, 310, null);
                view.setInterceptTouchEvents(this.f52650e);
                this.f52651f.invoke(view);
                File file = view.getController().getFile();
                if (file != null) {
                    Iterator<String> it = file.getArtboardNames().iterator();
                    while (it.hasNext()) {
                        Artboard artboard = file.artboard(it.next());
                        Iterator<T> it2 = artboard.getStateMachineNames().iterator();
                        while (it2.hasNext()) {
                            for (SMIInput sMIInput : artboard.stateMachine((String) it2.next()).getInputs()) {
                                if (!sMIInput.isNumber() && !sMIInput.isBoolean()) {
                                    sMIInput.isTrigger();
                                }
                                sMIInput.getName();
                            }
                        }
                        for (String str : artboard.getAnimationNames()) {
                        }
                    }
                }
                return b0.f48488a;
        }
    }

    public /* synthetic */ e(boolean z11, int i11, Fit fit, Alignment alignment, fz.c cVar) {
        this.f52650e = z11;
        this.f52647b = i11;
        this.f52648c = fit;
        this.f52649d = alignment;
        this.f52651f = cVar;
    }
}
