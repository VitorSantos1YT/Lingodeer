package h9;

import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.ui.TrackSelectionView;
import androidx.preference.Preference;
import com.facebook.share.widget.ShareButtonBase;
import com.google.common.collect.ImmutableList;
import com.lingo.lingoskill.widget.flingView.SwipeCardsView;
import java.util.ArrayList;
import java.util.HashMap;
import r.o2;
import y6.p0;
import y6.q0;
import y6.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32070b;

    public /* synthetic */ l0(Object obj, int i11) {
        this.f32069a = i11;
        this.f32070b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i11 = this.f32069a;
        boolean z11 = true;
        Message messageObtain = null;
        messageObtain = null;
        Object obj = this.f32070b;
        switch (i11) {
            case 0:
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                HashMap map = trackSelectionView.f2296t;
                if (view == trackSelectionView.f2292c) {
                    trackSelectionView.N = true;
                    map.clear();
                } else if (view == trackSelectionView.f2293d) {
                    trackSelectionView.N = false;
                    map.clear();
                } else {
                    trackSelectionView.N = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    m0 m0Var = (m0) tag;
                    u0 u0Var = m0Var.f32075a;
                    p0 p0Var = u0Var.f57364b;
                    int i12 = m0Var.f32076b;
                    q0 q0Var = (q0) map.get(p0Var);
                    if (q0Var == null) {
                        if (!trackSelectionView.K && !map.isEmpty()) {
                            map.clear();
                        }
                        map.put(p0Var, new q0(p0Var, ImmutableList.u(Integer.valueOf(i12))));
                    } else {
                        ArrayList arrayList = new ArrayList(q0Var.f57312b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        Object[] objArr = trackSelectionView.H && u0Var.f57365c;
                        if (objArr == false && (!trackSelectionView.K || trackSelectionView.f2295f.size() <= 1)) {
                            z11 = false;
                        }
                        if (zIsChecked && z11) {
                            arrayList.remove(Integer.valueOf(i12));
                            if (arrayList.isEmpty()) {
                                map.remove(p0Var);
                            } else {
                                map.put(p0Var, new q0(p0Var, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (objArr == true) {
                                arrayList.add(Integer.valueOf(i12));
                                map.put(p0Var, new q0(p0Var, arrayList));
                            } else {
                                map.put(p0Var, new q0(p0Var, ImmutableList.u(Integer.valueOf(i12))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                break;
            case 1:
                l.i iVar = (l.i) obj;
                if (view == iVar.f38999i && (message3 = iVar.f39001k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == iVar.f39002l && (message2 = iVar.f39003n) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == iVar.f39004o && (message = iVar.f39006q) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                iVar.F.obtainMessage(1, iVar.f38992b).sendToTarget();
                break;
            case 2:
                ((Preference) obj).u(view);
                break;
            case 3:
                ((p.c) obj).a();
                break;
            case 4:
                o2 o2Var = ((Toolbar) obj).f1051r0;
                q.n nVar = o2Var != null ? o2Var.f48619b : null;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
            case 5:
                ShareButtonBase shareButtonBase = (ShareButtonBase) obj;
                if (!qf.a.b(this)) {
                    try {
                        int i13 = ShareButtonBase.O;
                        if (!qf.a.b(shareButtonBase)) {
                            try {
                                View.OnClickListener onClickListener = shareButtonBase.f7710c;
                                if (onClickListener != null) {
                                    onClickListener.onClick(view);
                                }
                            } catch (Throwable th2) {
                                qf.a.a(shareButtonBase, th2);
                            }
                        }
                        shareButtonBase.getDialog().d(shareButtonBase.getShareContent());
                    } catch (Throwable th3) {
                        qf.a.a(this, th3);
                        return;
                    }
                    break;
                }
                break;
            default:
                SwipeCardsView swipeCardsView = (SwipeCardsView) obj;
                if (swipeCardsView.M != null && view.getScaleX() == 1.0f) {
                    swipeCardsView.M.j(view);
                    break;
                }
                break;
        }
    }
}
