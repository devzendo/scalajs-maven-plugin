/*
 * Copyright (C) 2008-2017 Matt Gumbley, DevZendo.org http://devzendo.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.devzendo.scalajs;

import org.apache.maven.artifact.metadata.ArtifactMetadataSource;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * A Maven plugin that simplifies creation of Scala.js projects.
 *
 * @author Matt Gumbley, DevZendo.org
 * @phase package
 * @goal doit
 *
 */
public final class PackageMojo extends AbstractMojo {
    /**
     * The Maven project.
     *
     * @parameter expression="${project}"
     */
    private org.apache.maven.project.MavenProject mavenProject;
    /**
     * @component
     */
    private org.apache.maven.artifact.factory.ArtifactFactory artifactFactory;
    /**
     * @component
     */
    private org.apache.maven.artifact.resolver.ArtifactResolver artifactResolver;
    /**
     * @parameter expression="${localRepository}"
     */
    private org.apache.maven.artifact.repository.ArtifactRepository localRepository;
    /**
     * @parameter expression="${project.remoteArtifactRepositories}"
     */
    private java.util.List<?> remoteRepositories;
    /**
     * @component
     */
    private ArtifactMetadataSource artifactMetadataSource;

    /**
     * {@inheritDoc}
     */
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Scala.JS Plugin");

    }
}
