package X3dForWebAuthors.Chapter01TechnicalOverview;

/*
Copyright (c) 1995-2017 held by the author(s).  All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer
      in the documentation and/or other materials provided with the
      distribution.
    * Neither the name of the Web3D Consortium (http://www.web3D.org)
      nor the names of its contributors may be used to endorse or
      promote products derived from this software without specific
      prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
*/

import java.util.*;
import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Texturing.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Simple X3D scene example: Hello World!. </p>
 <p> Related links: <a href="../../../Chapter01TechnicalOverview/HelloWorld.java">HelloWorld.java</a> source, <a href="../../../Chapter01TechnicalOverview/HelloWorldIndex.html" target="_top">HelloWorld catalog page</a>, <a href="http://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a> and <a href="http://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;" summary="Scene Metadata">
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter01TechnicalOverview/HelloWorld.x3d">HelloWorld.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Simple X3D scene example: Hello World! </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 30 October 2000 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 28 July 2015 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter01TechnicalOverview/HelloWorld.tall.png">HelloWorld.tall.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://en.wikipedia.org/wiki/Hello_world" target="_blank">http://en.wikipedia.org/wiki/Hello_world</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://en.wikipedia.org/wiki/Hello#.22Hello.2C_World.22_computer_program" target="_blank">https://en.wikipedia.org/wiki/Hello#.22Hello.2C_World.22_computer_program</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://en.wikipedia.org/wiki/%22Hello,_World!%22_program" target="_blank">https://en.wikipedia.org/wiki/"Hello,_World!"_program</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://en.wikibooks.org/w/index.php?title=Computer_Programming/Hello_world" target="_blank">http://en.wikibooks.org/w/index.php?title=Computer_Programming/Hello_world</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.HelloWorldExample.net" target="_blank">http://www.HelloWorldExample.net</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.web3D.org" target="_blank">http://www.web3D.org</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.web3d.org/realtime-3d/news/internationalization-x3d" target="_blank">http://www.web3d.org/realtime-3d/news/internationalization-x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.web3d.org/x3d/content/examples/HelloWorld.x3d" target="_blank">http://www.web3d.org/x3d/content/examples/HelloWorld.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://X3dGraphics.com/examples/X3dForAdvancedModeling/HelloWorldScenes" target="_blank">http://X3dGraphics.com/examples/X3dForAdvancedModeling/HelloWorldScenes</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter01TechnicalOverview/HelloWorld.x3d" target="_blank">http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter01TechnicalOverview/HelloWorld.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="http://www.web3d.org/x3d/content/examples/license.html" target="_blank">http://www.web3d.org/x3d/content/examples/license.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> HelloWorld.wrl </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter01TechnicalOverview/HelloWorld.x3dv">HelloWorld.x3dv</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter01TechnicalOverview/HelloWorld.x3db">HelloWorld.x3db</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> HelloWorld.xhtml </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter01TechnicalOverview/HelloWorld.json">HelloWorld.json</a> </td>
		</tr>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center;" colspan="2">  &nbsp; </td>
		</tr>
	</table>

	<p>
		This program uses the
		<a href="http://www.web3d.org/specifications/java/X3DJSAIL.html" target="_blank">X3D Java Scene Access Interface Library (X3DJSAIL)</a>.
		It has been produced using the 
		<a href="http://www.web3d.org/x3d/stylesheets/X3dToJava.xslt" target="_blank">X3dToJava.xslt</a>
		stylesheet to create Java source code from an <code>.x3d</code> scene.
	</p>

	* @author Don Brutzman
 */

public class HelloWorld
{
  /** Default constructor to create this object. */
  public HelloWorld ()
  {
    initialize();
  }
	
  /** Create and initialize the X3D model. */
  public final void initialize()
  {
  x3dModel = new X3DObject().setProfile("Immersive").setVersion("3.3")
  .setHead(new headObject()
    .addMeta(new metaObject().setName("title").setContent("HelloWorld.x3d"))
    .addMeta(new metaObject().setName("description").setContent("Simple X3D scene example: Hello World!"))
    .addMeta(new metaObject().setName("created").setContent("30 October 2000"))
    .addMeta(new metaObject().setName("modified").setContent("28 July 2015"))
    .addMeta(new metaObject().setName("creator").setContent("Don Brutzman"))
    .addMeta(new metaObject().setName("Image").setContent("HelloWorld.tall.png"))
    .addMeta(new metaObject().setName("reference").setContent("http://en.wikipedia.org/wiki/Hello_world"))
    .addMeta(new metaObject().setName("reference").setContent("https://en.wikipedia.org/wiki/Hello#.22Hello.2C_World.22_computer_program"))
    .addMeta(new metaObject().setName("reference").setContent("https://en.wikipedia.org/wiki/\"Hello,_World!\"_program"))
    .addMeta(new metaObject().setName("reference").setContent("http://en.wikibooks.org/w/index.php?title=Computer_Programming/Hello_world"))
    .addMeta(new metaObject().setName("reference").setContent("http://www.HelloWorldExample.net"))
    .addMeta(new metaObject().setName("reference").setContent("http://www.web3D.org"))
    .addMeta(new metaObject().setName("reference").setContent("http://www.web3d.org/realtime-3d/news/internationalization-x3d"))
    .addMeta(new metaObject().setName("reference").setContent("http://www.web3d.org/x3d/content/examples/HelloWorld.x3d"))
    .addMeta(new metaObject().setName("reference").setContent("http://X3dGraphics.com/examples/X3dForAdvancedModeling/HelloWorldScenes"))
    .addMeta(new metaObject().setName("identifier").setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter01TechnicalOverview/HelloWorld.x3d"))
    .addMeta(new metaObject().setName("license").setContent("http://www.web3d.org/x3d/content/examples/license.html"))
    .addMeta(new metaObject().setName("generator").setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addComments(" Alternate encodings: VRML97, X3D ClassicVRML Encoding, X3D Compressed Binary Encoding (CBE), X3DOM, JSON ")
    .addMeta(new metaObject().setName("reference").setContent("HelloWorld.wrl"))
    .addMeta(new metaObject().setName("reference").setContent("HelloWorld.x3dv"))
    .addMeta(new metaObject().setName("reference").setContent("HelloWorld.x3db"))
    .addMeta(new metaObject().setName("reference").setContent("HelloWorld.xhtml"))
    .addMeta(new metaObject().setName("reference").setContent("HelloWorld.json")))
  .setScene(new SceneObject()
    .addComments(" Example scene to illustrate X3D nodes and fields (XML elements and attributes) ")
    .addChild(new GroupObject()
      .addChild(new ViewpointObject("ViewUpClose").setDescription("Hello world!").setCenterOfRotation(0.0f,-1.0f,0.0f).setPosition(0.0f,-1.0f,7.0f))
      .addChild(new TransformObject().setRotation(0.0f,1.0f,0.0f,3.0f)
        .addChild(new ShapeObject()
          .setGeometry(new SphereObject())
          .setAppearance(new AppearanceObject()
            .setMaterial(new MaterialObject("MaterialLightBlue").setDiffuseColor(0.1f,0.5f,1.0f))
            .setTexture(new ImageTextureObject("ImageCloudlessEarth").setUrl(new MFStringObject("\"earth-topo.png\" \"earth-topo.jpg\" \"earth-topo-small.gif\" \"http://www.web3d.org/x3d/content/examples/Basic/earth-topo.png\" \"http://www.web3d.org/x3d/content/examples/Basic/earth-topo.jpg\" \"http://www.web3d.org/x3d/content/examples/Basic/earth-topo-small.gif\""))))))
      .addChild(new TransformObject().setTranslation(0.0f,-2.0f,0.0f)
        .addChild(new ShapeObject()
          .setGeometry(new TextObject("TextMessage").setString(new MFStringObject("\"Hello\" \"world!\""))
            .setFontStyle(new FontStyleObject().setJustify(new MFStringObject("\"MIDDLE\" \"MIDDLE\""))))
          .setAppearance(new AppearanceObject()
            .setMaterial(new MaterialObject().setUSE("MaterialLightBlue")))))));
  }
  // end of initialize() method

  /** The initialized model object, created within initialize() method. */
  private X3DObject x3dModel;
  
  /** Provide a shallow copy of the X3D model.
   * @return HelloWorld model
   */
  public X3DObject getX3dModel()
  {	  
	  return x3dModel;
  }
	   
    /** Default main() method provided for test purposes.
     * @param argv input parameters
     */
    public static void main(String argv[])
    {
		X3DObject exampleObject = new HelloWorld().getX3dModel();
		
		exampleObject.handleArguments(argv);
		System.out.print("HelloWorld self-validation test results: ");
		String validationResults = exampleObject.validationReport();
		System.out.println(validationResults);
	}
}
