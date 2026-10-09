package com.lingo.fluent.ui.base.adapter;

import a5.j;
import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import b0.a;
import bq.r;
import bq.z;
import cf.x;
import com.bumptech.glide.c;
import com.bumptech.glide.p;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdLessonDao;
import com.lingo.lingoskill.object.PdLessonFav;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.m;
import rz.b0;
import rz.e0;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdFavAdapter extends BaseQuickAdapter<PdLessonFav, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f21624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f21625b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdFavAdapter(ArrayList data, LifecycleCoroutineScope scope) {
        super(R.layout.item_pd_all_adapter, data);
        m.f(data, "data");
        m.f(scope, "scope");
        this.f21624a = scope;
    }

    public final void a(BaseViewHolder baseViewHolder, PdLesson pdLesson) {
        baseViewHolder.setText(R.id.tv_title, pdLesson.getTitle());
        baseViewHolder.setText(R.id.tv_sub_title, pdLesson.getTitleTranslation());
        p pVarE = c.e(this.mContext);
        Long lessonId = pdLesson.getLessonId();
        m.e(lessonId, "getLessonId(...)");
        pVarE.k(th.j.e(lessonId.longValue())).x((ImageView) baseViewHolder.getView(R.id.iv_icon));
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_difficulty);
        Resources resources = textView.getContext().getResources();
        String difficuty = pdLesson.getDifficuty();
        m.e(difficuty, "getDifficuty(...)");
        String lowerCase = difficuty.toLowerCase(Locale.ROOT);
        m.e(lowerCase, "toLowerCase(...)");
        textView.setText(textView.getContext().getString(resources.getIdentifier(lowerCase, "string", textView.getContext().getPackageName())));
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_fav);
        int[] iArr = r.f4959a;
        String str = bq.m.k(th.j.d()) + "_" + pdLesson.getLessonId();
        imageView.setImageResource(R.drawable.ic_pd_word_tag_fav);
        z.b(imageView, new a(str, imageView, this, pdLesson, 15));
        List listC = th.j.c();
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.tv_title);
        if (listC.contains(pdLesson.getLessonId())) {
            Context context = textView2.getContext();
            m.e(context, "getContext(...)");
            textView2.setTextColor(context.getColor(R.color.lesson_title_entered));
        } else {
            Context context2 = textView2.getContext();
            m.e(context2, "getContext(...)");
            textView2.setTextColor(context2.getColor(R.color.lesson_title));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, PdLessonFav pdLessonFav) {
        PdLessonFav item = pdLessonFav;
        m.f(helper, "helper");
        m.f(item, "item");
        PdLesson pdLesson = item.getPdLesson();
        if (pdLesson != null) {
            a(helper, pdLesson);
            return;
        }
        PdLessonDao pdLessonDao = PdLessonDbHelper.INSTANCE.pdLessonDao();
        int[] iArr = r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        Long lessonId = item.getLessonId();
        m.e(lessonId, "getLessonId(...)");
        PdLesson pdLesson2 = (PdLesson) pdLessonDao.load(bq.m.l(i11, lessonId.longValue()));
        if (pdLesson2 != null) {
            item.setPdLesson(pdLesson2);
            a(helper, pdLesson2);
        } else {
            e0.B(this.f21624a, null, null, new fr.c(item, this, helper, (d) null, 20), 3);
        }
    }
}
