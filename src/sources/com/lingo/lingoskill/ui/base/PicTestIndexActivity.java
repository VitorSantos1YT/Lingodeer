package com.lingo.lingoskill.ui.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.rive.runtime.kotlin.core.a;
import ay.x;
import bp.g;
import bp.g4;
import bp.h;
import bp.q4;
import bq.z;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.ui.base.PicTestIndexActivity;
import com.lingo.lingoskill.ui.base.adapter.PicTestIndexAdapter;
import com.lingo.lingoskill.ui.learn.DebugTestActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fz.c;
import hd.d;
import hj.o0;
import java.util.ArrayList;
import ji.b;
import kotlin.jvm.internal.m;
import ky.e;
import th.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PicTestIndexActivity extends b {
    public static final /* synthetic */ int R = 0;
    public PicTestIndexAdapter P;
    public final ArrayList Q;

    public PicTestIndexActivity() {
        super(BuildConfig.VERSION_NAME, q4.f4778a);
        this.Q = new ArrayList();
    }

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        boolean z11 = xt.b.f56279a;
        xt.b.f56279a = false;
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        xt.b.f56279a = true;
        ArrayList data = this.Q;
        m.f(data, "data");
        this.P = new PicTestIndexAdapter(R.layout.item_pic_test_index, data);
        ((o0) j()).f33006e.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView = ((o0) j()).f33006e;
        PicTestIndexAdapter picTestIndexAdapter = this.P;
        if (picTestIndexAdapter == null) {
            m.n("adapter");
            throw null;
        }
        recyclerView.setAdapter(picTestIndexAdapter);
        j.a(new x(new g(1)).f(h.f4611f).k(e.f38937b).g(px.b.a()).h(new d(this, 5), vx.b.f54316e), this.f36391f);
        PicTestIndexAdapter picTestIndexAdapter2 = this.P;
        if (picTestIndexAdapter2 == null) {
            m.n("adapter");
            throw null;
        }
        picTestIndexAdapter2.setOnItemClickListener(new a(this, 9));
        final int i11 = 0;
        z.b(((o0) j()).f33003b, new c(this) { // from class: bp.p4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PicTestIndexActivity f4760b;

            {
                this.f4760b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                qy.b0 b0Var = qy.b0.f48488a;
                PicTestIndexActivity picTestIndexActivity = this.f4760b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        int i13 = PicTestIndexActivity.R;
                        kotlin.jvm.internal.m.f(it, "it");
                        picTestIndexActivity.u();
                        break;
                    case 1:
                        int i14 = PicTestIndexActivity.R;
                        kotlin.jvm.internal.m.f(it, "it");
                        String string = ((hj.o0) picTestIndexActivity.j()).f33005d.getText().toString();
                        int length = string.length() - 1;
                        int i15 = 0;
                        boolean z11 = false;
                        while (i15 <= length) {
                            boolean z12 = kotlin.jvm.internal.m.h(string.charAt(!z11 ? i15 : length), 32) <= 0;
                            if (z11) {
                                if (!z12) {
                                    String modelStr = string.subSequence(i15, length + 1).toString();
                                    kotlin.jvm.internal.m.f(modelStr, "modelStr");
                                    Intent intent = new Intent(picTestIndexActivity, (Class<?>) DebugTestActivity.class);
                                    intent.putExtra(INTENTS.EXTRA_STRING, modelStr);
                                    picTestIndexActivity.startActivity(intent);
                                } else {
                                    length--;
                                }
                                break;
                            } else if (z12) {
                                i15++;
                            } else {
                                z11 = true;
                            }
                        }
                        String modelStr2 = string.subSequence(i15, length + 1).toString();
                        kotlin.jvm.internal.m.f(modelStr2, "modelStr");
                        Intent intent2 = new Intent(picTestIndexActivity, (Class<?>) DebugTestActivity.class);
                        intent2.putExtra(INTENTS.EXTRA_STRING, modelStr2);
                        picTestIndexActivity.startActivity(intent2);
                        break;
                    default:
                        int i16 = PicTestIndexActivity.R;
                        kotlin.jvm.internal.m.f(it, "it");
                        LingoSkillApplication.f21669f = !LingoSkillApplication.f21669f;
                        ((hj.o0) picTestIndexActivity.j()).f33008g.setChecked(LingoSkillApplication.f21669f);
                        picTestIndexActivity.u();
                        break;
                }
                return b0Var;
            }
        });
        final int i12 = 1;
        z.b(((o0) j()).f33004c, new c(this) { // from class: bp.p4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PicTestIndexActivity f4760b;

            {
                this.f4760b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                qy.b0 b0Var = qy.b0.f48488a;
                PicTestIndexActivity picTestIndexActivity = this.f4760b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        int i14 = PicTestIndexActivity.R;
                        kotlin.jvm.internal.m.f(it, "it");
                        picTestIndexActivity.u();
                        break;
                    case 1:
                        int i15 = PicTestIndexActivity.R;
                        kotlin.jvm.internal.m.f(it, "it");
                        String string = ((hj.o0) picTestIndexActivity.j()).f33005d.getText().toString();
                        int length = string.length() - 1;
                        int i16 = 0;
                        boolean z11 = false;
                        while (i16 <= length) {
                            boolean z12 = kotlin.jvm.internal.m.h(string.charAt(!z11 ? i16 : length), 32) <= 0;
                            if (z11) {
                                if (!z12) {
                                    String modelStr2 = string.subSequence(i16, length + 1).toString();
                                    kotlin.jvm.internal.m.f(modelStr2, "modelStr");
                                    Intent intent2 = new Intent(picTestIndexActivity, (Class<?>) DebugTestActivity.class);
                                    intent2.putExtra(INTENTS.EXTRA_STRING, modelStr2);
                                    picTestIndexActivity.startActivity(intent2);
                                } else {
                                    length--;
                                }
                                break;
                            } else if (z12) {
                                i16++;
                            } else {
                                z11 = true;
                            }
                        }
                        String modelStr3 = string.subSequence(i16, length + 1).toString();
                        kotlin.jvm.internal.m.f(modelStr3, "modelStr");
                        Intent intent3 = new Intent(picTestIndexActivity, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, modelStr3);
                        picTestIndexActivity.startActivity(intent3);
                        break;
                    default:
                        int i17 = PicTestIndexActivity.R;
                        kotlin.jvm.internal.m.f(it, "it");
                        LingoSkillApplication.f21669f = !LingoSkillApplication.f21669f;
                        ((hj.o0) picTestIndexActivity.j()).f33008g.setChecked(LingoSkillApplication.f21669f);
                        picTestIndexActivity.u();
                        break;
                }
                return b0Var;
            }
        });
        ((o0) j()).f33008g.setChecked(LingoSkillApplication.f21669f);
        final int i13 = 2;
        z.b(((o0) j()).f33008g, new c(this) { // from class: bp.p4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PicTestIndexActivity f4760b;

            {
                this.f4760b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i14 = i13;
                qy.b0 b0Var = qy.b0.f48488a;
                PicTestIndexActivity picTestIndexActivity = this.f4760b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        int i15 = PicTestIndexActivity.R;
                        kotlin.jvm.internal.m.f(it, "it");
                        picTestIndexActivity.u();
                        break;
                    case 1:
                        int i16 = PicTestIndexActivity.R;
                        kotlin.jvm.internal.m.f(it, "it");
                        String string = ((hj.o0) picTestIndexActivity.j()).f33005d.getText().toString();
                        int length = string.length() - 1;
                        int i17 = 0;
                        boolean z11 = false;
                        while (i17 <= length) {
                            boolean z12 = kotlin.jvm.internal.m.h(string.charAt(!z11 ? i17 : length), 32) <= 0;
                            if (z11) {
                                if (!z12) {
                                    String modelStr3 = string.subSequence(i17, length + 1).toString();
                                    kotlin.jvm.internal.m.f(modelStr3, "modelStr");
                                    Intent intent3 = new Intent(picTestIndexActivity, (Class<?>) DebugTestActivity.class);
                                    intent3.putExtra(INTENTS.EXTRA_STRING, modelStr3);
                                    picTestIndexActivity.startActivity(intent3);
                                } else {
                                    length--;
                                }
                                break;
                            } else if (z12) {
                                i17++;
                            } else {
                                z11 = true;
                            }
                        }
                        String modelStr4 = string.subSequence(i17, length + 1).toString();
                        kotlin.jvm.internal.m.f(modelStr4, "modelStr");
                        Intent intent4 = new Intent(picTestIndexActivity, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, modelStr4);
                        picTestIndexActivity.startActivity(intent4);
                        break;
                    default:
                        int i18 = PicTestIndexActivity.R;
                        kotlin.jvm.internal.m.f(it, "it");
                        LingoSkillApplication.f21669f = !LingoSkillApplication.f21669f;
                        ((hj.o0) picTestIndexActivity.j()).f33008g.setChecked(LingoSkillApplication.f21669f);
                        picTestIndexActivity.u();
                        break;
                }
                return b0Var;
            }
        });
    }

    public final void u() {
        g4 g4Var = new g4(this, 1);
        int i11 = qx.d.f48466a;
        j.a(new zx.c(g4Var).f(e.f38937b).b(px.b.a()).c(new hd.b(this, 4), h.f4610e), this.f36391f);
    }
}
