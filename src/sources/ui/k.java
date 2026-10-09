package ui;

import android.widget.ImageView;
import com.lingo.lingoskill.chineseskill.ui.pinyin.adapter.PinyinLessonIndexRecyclerAdapter;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements i.b, bq.e, tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52998b;

    public /* synthetic */ k(Object obj, int i11) {
        this.f52997a = i11;
        this.f52998b = obj;
    }

    @Override // bq.e
    public void a() {
        switch (this.f52997a) {
            case 1:
                ImageView imageView = ((q) this.f52998b).S;
                if (imageView != null) {
                    android.support.v4.media.session.a.H(imageView.getBackground());
                }
                break;
            default:
                ImageView imageView2 = ((b0) this.f52998b).T;
                if (imageView2 != null) {
                    android.support.v4.media.session.a.H(imageView2.getBackground());
                }
                break;
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        SlowPlaySwitchBtn slowPlaySwitchBtn = (SlowPlaySwitchBtn) this.f52998b;
        int i11 = SlowPlaySwitchBtn.f22147t;
        slowPlaySwitchBtn.setClickable(true);
    }

    public void b() {
        switch (this.f52997a) {
            case 5:
                a0.e eVar = (a0.e) this.f52998b;
                synchronized (x1.l.f55691c) {
                    x1.l.f55697i = ry.m.F0((List) x1.l.f55697i, eVar);
                }
                x1.l.a();
                return;
            default:
                fz.e eVar2 = (fz.e) this.f52998b;
                synchronized (x1.l.f55691c) {
                    x1.l.f55696h = ry.m.F0((List) x1.l.f55696h, eVar2);
                }
                return;
        }
    }

    @Override // i.b
    public void f(Object obj) {
        m mVar = (m) this.f52998b;
        i.a it = (i.a) obj;
        kotlin.jvm.internal.m.f(it, "it");
        PinyinLessonIndexRecyclerAdapter pinyinLessonIndexRecyclerAdapter = mVar.O;
        if (pinyinLessonIndexRecyclerAdapter != null) {
            if (ij.l.f34436b == null) {
                synchronized (ij.l.class) {
                    if (ij.l.f34436b == null) {
                        ij.l.f34436b = new ij.l();
                    }
                }
            }
            pinyinLessonIndexRecyclerAdapter.f21745b = b7.e0.d(ij.l.f34436b, 0);
        }
        PinyinLessonIndexRecyclerAdapter pinyinLessonIndexRecyclerAdapter2 = mVar.O;
        if (pinyinLessonIndexRecyclerAdapter2 != null) {
            pinyinLessonIndexRecyclerAdapter2.notifyDataSetChanged();
        }
        mVar.x();
    }
}
