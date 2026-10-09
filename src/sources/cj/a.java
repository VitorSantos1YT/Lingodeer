package cj;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import b7.e0;
import bq.r;
import cf.x;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.sc.adapter.ScDetailAdapter;
import com.lingo.lingoskill.object.TravelPhrase;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import fv.g;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import oz.q;
import qy.b0;
import rt.m9;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TravelPhrase f7162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScDetailAdapter f7163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BaseViewHolder f7164d;

    public /* synthetic */ a(ScDetailAdapter scDetailAdapter, BaseViewHolder baseViewHolder, TravelPhrase travelPhrase, int i11) {
        this.f7161a = i11;
        this.f7163c = scDetailAdapter;
        this.f7164d = baseViewHolder;
        this.f7162b = travelPhrase;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0200  */
    /* JADX WARN: Code duplicated, block: B:67:0x0206  */
    /* JADX WARN: Code duplicated, block: B:68:0x0209  */
    /* JADX WARN: Code duplicated, block: B:69:0x020c  */
    /* JADX WARN: Code duplicated, block: B:79:0x022a  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        th.e eVar;
        String strM;
        String str;
        int i11 = this.f7161a;
        ScDetailAdapter scDetailAdapter = this.f7163c;
        b0 b0Var = b0.f48488a;
        TravelPhrase travelPhrase = this.f7162b;
        BaseViewHolder baseViewHolder = this.f7164d;
        switch (i11) {
            case 0:
                View it = (View) obj;
                m.f(it, "it");
                ur.a aVar = scDetailAdapter.f21762d;
                th.e eVar2 = scDetailAdapter.f21759a;
                aVar.c("jxz_tv_learn_click_item", new m9(26));
                if (baseViewHolder.getAdapterPosition() != scDetailAdapter.f21766h) {
                    int adapterPosition = baseViewHolder.getAdapterPosition();
                    scDetailAdapter.f21766h = adapterPosition;
                    scDetailAdapter.notifyDataSetChanged();
                    if (adapterPosition == scDetailAdapter.getItemCount() - 1) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) scDetailAdapter.f21761c.getLayoutManager();
                        m.c(linearLayoutManager);
                        linearLayoutManager.scrollToPositionWithOffset(adapterPosition, h.l(220.0f));
                    }
                } else if (eVar2.f()) {
                    eVar2.g();
                }
                if (q.v0("release", "debug", false)) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    if (l.D(new Integer[]{18, 69, 19}, Integer.valueOf(x.n().keyLanguage))) {
                        int[] iArr = r.f4959a;
                        int i12 = x.n().keyLanguage;
                        if (i12 == 40) {
                            str = "http://192.168.31.31:1111/AdminZG/";
                        } else if (i12 == 57) {
                            str = "http://192.168.31.31:1313/AdminZG/";
                        } else if (i12 == 61) {
                            str = "http://192.168.31.31:2626/AdminZG/";
                        } else if (i12 == 63) {
                            str = "http://192.168.31.31:2727/AdminZG/";
                        } else if (i12 == 65) {
                            str = "http://192.168.31.31:2828/AdminZG/";
                        } else if (i12 != 69) {
                            switch (i12) {
                                case 0:
                                    str = "http://192.168.31.31:1515/AdminZG/";
                                    break;
                                case 1:
                                    str = "http://192.168.31.31:1818/AdminZG/";
                                    break;
                                case 2:
                                    str = "http://192.168.31.31:1717/AdminZG/";
                                    break;
                                case 3:
                                    str = "http://192.168.31.31:1616/AdminZG/";
                                    break;
                                case 4:
                                    str = "http://192.168.31.31:2121/AdminZG/";
                                    break;
                                case 5:
                                    str = "http://192.168.31.31:2323/AdminZG/";
                                    break;
                                case 6:
                                    str = "http://192.168.31.31:1212/AdminZG/";
                                    break;
                                case 7:
                                    str = "http://192.168.31.31:2020/AdminZG/";
                                    break;
                                case 8:
                                    str = "http://192.168.31.31:1919/AdminZG/";
                                    break;
                                default:
                                    switch (i12) {
                                        case 10:
                                        case 22:
                                            str = "http://192.168.31.31:2424/AdminZG/";
                                            break;
                                        case 11:
                                            str = "http://192.168.31.31:3535/AdminZG/";
                                            break;
                                        case 12:
                                            str = "http://192.168.31.31:3838/AdminZG/";
                                            break;
                                        case 13:
                                            str = "http://192.168.31.31:3737/AdminZG/";
                                            break;
                                        case 14:
                                            str = "http://192.168.31.31:2121/AdminZG/";
                                            break;
                                        case 15:
                                            str = "http://192.168.31.31:2323/AdminZG/";
                                            break;
                                        case 16:
                                            str = "http://192.168.31.31:1212/AdminZG/";
                                            break;
                                        case 17:
                                            str = "http://192.168.31.31:1919/AdminZG/";
                                            break;
                                        case 18:
                                            str = "http://192.168.31.31:1414/AdminZG/";
                                            break;
                                        case 19:
                                            str = "http://192.168.31.31:2929/AdminZG/";
                                            break;
                                        case 20:
                                            str = "http://192.168.31.31:1111/AdminZG/";
                                            break;
                                        case 21:
                                            str = "http://192.168.31.31:2525/AdminZG/";
                                            break;
                                        default:
                                            switch (i12) {
                                                case 47:
                                                case 48:
                                                    str = "http://192.168.31.31:4141/AdminZG/";
                                                    break;
                                                case 49:
                                                case 50:
                                                    str = "http://192.168.31.31:9601/AdminZG/";
                                                    break;
                                                default:
                                                    switch (i12) {
                                                        case 53:
                                                        case 54:
                                                            str = "http://192.168.31.31:4343/AdminZG/";
                                                            break;
                                                        case 55:
                                                            break;
                                                        default:
                                                            str = BuildConfig.VERSION_NAME;
                                                            break;
                                                    }
                                                case 51:
                                                    str = "http://192.168.31.31:1010/AdminZG/";
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            str = "http://192.168.31.31:3232/AdminZG/";
                        }
                        strM = oz.x.q0(str, "AdminZG", "ShareMaterials") + "Lingo/travel_phrase/" + g.h() + "-travelphrase-f-" + travelPhrase.getCID() + "-" + travelPhrase.getID() + ".mp3";
                    } else {
                        String strN = xt.b.a().n();
                        qy.q qVar = fv.b.f28186a;
                        strM = defpackage.e.m(strN, fv.b.Q(travelPhrase.getCID(), travelPhrase.getID()));
                    }
                    if (l.D(new Integer[]{18, 69, 19}, Integer.valueOf(x.n().keyLanguage))) {
                        Uri uri = Uri.parse(strM);
                        m.e(uri, "parse(...)");
                        eVar = eVar2;
                        eVar.j(uri);
                    } else {
                        eVar = eVar2;
                        eVar.h(strM);
                    }
                } else {
                    eVar = eVar2;
                    String strN2 = xt.b.a().n();
                    qy.q qVar2 = fv.b.f28186a;
                    strM = strN2 + fv.b.Q(travelPhrase.getCID(), travelPhrase.getID());
                    eVar.h(strM);
                }
                eVar.m(scDetailAdapter.f21769k ? 0.8f : 1.0f, true);
                eVar.f52416c = new ob.l(3, scDetailAdapter, strM);
                break;
            case 1:
                View it2 = (View) obj;
                m.f(it2, "it");
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                String strK = e0.k(travelPhrase.getID(), xt.d.k(x.n().keyLanguage), "_sc_");
                ScDetailAdapter scDetailAdapter2 = this.f7163c;
                LinkedHashMap linkedHashMap = scDetailAdapter2.f21770l;
                Boolean bool = (Boolean) linkedHashMap.get(strK);
                boolean z11 = !(bool != null ? bool.booleanValue() : false);
                linkedHashMap.put(strK, Boolean.valueOf(z11));
                View view = baseViewHolder.getView(R.id.iv_fav);
                m.e(view, "getView(...)");
                scDetailAdapter2.b((ImageView) view, strK);
                rz.e0.B(scDetailAdapter2.f21763e, null, null, new e(scDetailAdapter2, strK, z11, null, 1), 3);
                break;
            case 2:
                ScDetailAdapter.a(scDetailAdapter, baseViewHolder, travelPhrase, (View) obj);
                break;
            default:
                View it3 = (View) obj;
                m.f(it3, "it");
                th.e eVar3 = scDetailAdapter.f21759a;
                if (!eVar3.f()) {
                    eVar3.m(scDetailAdapter.f21769k ? 0.8f : 1.0f, false);
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    eVar3.h(x.n().tempDir + xt.d.k(x.n().keyLanguage) + "_sc_" + travelPhrase.getCID() + "_" + travelPhrase.getID() + "_recorder.mp3");
                    eVar3.f52416c = new d(baseViewHolder, scDetailAdapter);
                    android.support.v4.media.session.a.K(baseViewHolder.getView(R.id.iv_play_recorder).getBackground());
                    if (baseViewHolder.getView(R.id.iv_recorder) != null) {
                        baseViewHolder.getView(R.id.iv_recorder).setClickable(false);
                        baseViewHolder.getView(R.id.iv_recorder).setBackgroundResource(R.drawable.point_grey);
                    }
                } else {
                    eVar3.n();
                    if (baseViewHolder.getView(R.id.iv_recorder) != null) {
                        baseViewHolder.getView(R.id.iv_recorder).setClickable(true);
                        baseViewHolder.getView(R.id.iv_recorder).setBackgroundResource(R.drawable.bg_lesson_index_start_btn_enable);
                    }
                    android.support.v4.media.session.a.H(baseViewHolder.getView(R.id.iv_play_recorder).getBackground());
                }
                break;
        }
        return b0Var;
    }

    public /* synthetic */ a(TravelPhrase travelPhrase, ScDetailAdapter scDetailAdapter, BaseViewHolder baseViewHolder) {
        this.f7161a = 1;
        this.f7162b = travelPhrase;
        this.f7163c = scDetailAdapter;
        this.f7164d = baseViewHolder;
    }
}
