package py;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import aw.t;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingo.lingoskill.widget.BrainWaveView;
import com.lingo.lingoskill.widget.ResponsiveScrollView;
import com.lingo.lingoskill.widget.ScrollTextView;
import com.yalantis.ucrop.view.CropImageView;
import fw.d;
import hj.d5;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import o20.w;
import oo.k0;
import t5.f;
import t7.m;
import uv.j;
import xs.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f47212b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f47211a = i11;
        this.f47212b = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        View viewD;
        int width;
        View viewFindViewByPosition;
        int i11 = this.f47211a;
        Object obj = this.f47212b;
        switch (i11) {
            case 0:
                new Handler(Looper.getMainLooper()).post(new t(20, this, (Context) ((c) obj).f47214a.get()));
                break;
            case 1:
                h hVar = (h) obj;
                DropDownListView dropDownListView = hVar.f1096c;
                if (dropDownListView != null && dropDownListView.isAttachedToWindow() && hVar.f1096c.getCount() > hVar.f1096c.getChildCount() && hVar.f1096c.getChildCount() <= hVar.O) {
                    hVar.f1095b0.setInputMethodMode(2);
                    hVar.a();
                    break;
                }
                break;
            case 2:
                ((Toolbar) obj).v();
                break;
            case 3:
                f fVar = (f) obj;
                DrawerLayout drawerLayout = fVar.f52048d;
                int i12 = fVar.f52046b.f39761o;
                int i13 = fVar.f52045a;
                boolean z11 = i13 == 3;
                if (z11) {
                    viewD = drawerLayout.d(3);
                    width = (viewD != null ? -viewD.getWidth() : 0) + i12;
                } else {
                    viewD = drawerLayout.d(5);
                    width = drawerLayout.getWidth() - i12;
                }
                if (viewD != null) {
                    if (((z11 && viewD.getLeft() < width) || (!z11 && viewD.getLeft() > width)) && drawerLayout.f(viewD) == 0) {
                        t5.c cVar = (t5.c) viewD.getLayoutParams();
                        fVar.f52046b.t(viewD, width, viewD.getTop());
                        cVar.f52038c = true;
                        drawerLayout.invalidate();
                        View viewD2 = drawerLayout.d(i13 == 3 ? 5 : 3);
                        if (viewD2 != null) {
                            drawerLayout.b(viewD2, true);
                        }
                        if (!drawerLayout.T) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                            int childCount = drawerLayout.getChildCount();
                            for (int i14 = 0; i14 < childCount; i14++) {
                                drawerLayout.getChildAt(i14).dispatchTouchEvent(motionEventObtain);
                            }
                            motionEventObtain.recycle();
                            drawerLayout.T = true;
                        }
                        break;
                    }
                }
                break;
            case 4:
                ((m) obj).d();
                break;
            case 5:
                ViewPager viewPager = (ViewPager) obj;
                viewPager.setScrollState(0);
                viewPager.q();
                break;
            case 6:
                ((j) obj).a();
                break;
            case 7:
                Process.setThreadPriority(10);
                ((Runnable) obj).run();
                break;
            case 8:
                dm.c cVar2 = (dm.c) obj;
                cVar2.getClass();
                while (true) {
                    try {
                        cVar2.d((vd.b) ((ReferenceQueue) cVar2.f23492d).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 9:
                int i15 = BrainWaveView.f22083e;
                ((BrainWaveView) obj).getClass();
                break;
            case 10:
                ResponsiveScrollView responsiveScrollView = (ResponsiveScrollView) obj;
                long jCurrentTimeMillis = System.currentTimeMillis() - responsiveScrollView.f22127k0;
                int i16 = responsiveScrollView.f22128l0;
                if (jCurrentTimeMillis <= i16) {
                    responsiveScrollView.postDelayed(this, i16);
                    break;
                } else {
                    responsiveScrollView.f22127k0 = -1L;
                    vq.m mVar = responsiveScrollView.f22130n0;
                    if (mVar != null) {
                        k0 k0Var = (k0) ((w) mVar).f44617b;
                        if (k0Var.getView() != null) {
                            ta.a aVar = k0Var.f36400f;
                            kotlin.jvm.internal.m.c(aVar);
                            RecyclerView recyclerView = ((d5) aVar).f32498d;
                            kotlin.jvm.internal.m.c(recyclerView);
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                            kotlin.jvm.internal.m.c(linearLayoutManager);
                            for (int itemCount = linearLayoutManager.getItemCount() - 1; -1 < itemCount && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(itemCount)) != null; itemCount--) {
                                int[] iArr = new int[2];
                                viewFindViewByPosition.getLocationInWindow(iArr);
                                int[] iArr2 = new int[2];
                                ta.a aVar2 = k0Var.f36400f;
                                kotlin.jvm.internal.m.c(aVar2);
                                ResponsiveScrollView responsiveScrollView2 = ((d5) aVar2).f32499e;
                                kotlin.jvm.internal.m.c(responsiveScrollView2);
                                responsiveScrollView2.getLocationInWindow(iArr2);
                                if (iArr[1] - iArr2[1] <= 0) {
                                    SpeakTryAdapter speakTryAdapter = k0Var.R;
                                    kotlin.jvm.internal.m.c(speakTryAdapter);
                                    if (speakTryAdapter.f22018e != itemCount) {
                                        viewFindViewByPosition.performClick();
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 11:
                ScrollTextView scrollTextView = (ScrollTextView) obj;
                TextView textView = scrollTextView.f22141b;
                TextView textView2 = scrollTextView.f22140a;
                int i17 = scrollTextView.H;
                scrollTextView.f22143d = !scrollTextView.f22143d;
                if (scrollTextView.f22146t == scrollTextView.f22145f.size() - 1) {
                    scrollTextView.f22146t = 0;
                }
                if (scrollTextView.f22143d) {
                    List list = scrollTextView.f22145f;
                    int i18 = scrollTextView.f22146t;
                    scrollTextView.f22146t = i18 + 1;
                    textView2.setText((CharSequence) list.get(i18));
                    textView.setText((CharSequence) scrollTextView.f22145f.get(scrollTextView.f22146t));
                } else {
                    List list2 = scrollTextView.f22145f;
                    int i19 = scrollTextView.f22146t;
                    scrollTextView.f22146t = i19 + 1;
                    textView.setText((CharSequence) list2.get(i19));
                    textView2.setText((CharSequence) scrollTextView.f22145f.get(scrollTextView.f22146t));
                }
                boolean z12 = scrollTextView.f22143d;
                ObjectAnimator.ofFloat(textView2, "translationY", z12 ? 0 : i17, z12 ? -i17 : 0).setDuration(300L).start();
                boolean z13 = scrollTextView.f22143d;
                ObjectAnimator.ofFloat(textView, "translationY", z13 ? i17 : 0, z13 ? 0 : -i17).setDuration(300L).start();
                scrollTextView.f22142c.postDelayed(scrollTextView.f22144e, 3000L);
                break;
            case 12:
                ((xs.b) ((d) obj).f28227b).f56218d.start();
                break;
            case 13:
                g gVar = (g) obj;
                ((BitmapDrawable) gVar.f56236b.getDrawable()).getBitmap().recycle();
                gVar.f56236b.setImageBitmap(null);
                break;
            case 14:
                xs.h hVar2 = (xs.h) obj;
                hVar2.f56244e = false;
                hVar2.N = true;
                try {
                    hVar2.h();
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return;
                }
                break;
            default:
                AndroidComposeView androidComposeView = (AndroidComposeView) obj;
                androidComposeView.removeCallbacks(this);
                MotionEvent motionEvent = androidComposeView.V0;
                if (motionEvent != null) {
                    i14 = motionEvent.getToolType(0) == 3 ? 1 : 0;
                    int actionMasked = motionEvent.getActionMasked();
                    if (i14 != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                        }
                    } else if (actionMasked == 1) {
                    }
                    AndroidComposeView androidComposeView2 = (AndroidComposeView) obj;
                    androidComposeView2.H(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, androidComposeView2.W0, false);
                }
                break;
        }
    }
}
