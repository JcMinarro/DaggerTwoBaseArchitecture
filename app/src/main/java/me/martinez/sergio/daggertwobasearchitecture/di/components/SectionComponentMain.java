/*
 *  Copyright (C) 2015 Sergio Martinez Open Source Project
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package me.martinez.sergio.daggertwobasearchitecture.di.components;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 15/7/15.
 */

import dagger.Component;
import me.martinez.sergio.daggertwobasearchitecture.activities.MainActivityComponent;
import me.martinez.sergio.daggertwobasearchitecture.di.anotations.scopes.PerSection;
import me.martinez.sergio.daggertwobasearchitecture.fragments.sections.testsection.TestSectionModule;
import me.martinez.sergio.daggertwobasearchitecture.fragments.sections.testsection.firststep.FirstFragment;
import me.martinez.sergio.daggertwobasearchitecture.fragments.sections.testsection.secondstep.SecondFragment;
import me.martinez.sergio.daggertwobasearchitecture.test.SectionProperty;

@PerSection
@Component( dependencies = MainActivityComponent.class, modules = TestSectionModule.class)
public interface SectionComponentMain extends
    FirstFragment.Pluser,
    SecondFragment.Pluser{
}
